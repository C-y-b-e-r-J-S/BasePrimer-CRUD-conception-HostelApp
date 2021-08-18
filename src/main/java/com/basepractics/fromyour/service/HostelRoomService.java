package com.basepractics.fromyour.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.basepractics.fromyour.exeption.RoomNotFound;
import com.basepractics.fromyour.model.HostelRoom;
import com.basepractics.fromyour.repo.HostelRoomRepo;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
@Transactional
public class HostelRoomService {
    private final HostelRoomRepo hostelroomRepo;

    @Autowired
    public HostelRoomService(HostelRoomRepo hostelroomRepo) {
        this.hostelroomRepo = hostelroomRepo;
    }

    public HostelRoom addHostelRoom(HostelRoom hostelroom) {
        hostelroom.setHostelroomCode(UUID.randomUUID().toString());
        return hostelroomRepo.save(hostelroom);
    }

    public List<HostelRoom> findAllHostelRooms() {
        return hostelroomRepo.findAll();
    }

    public HostelRoom updateHostelRoom(HostelRoom hostelroom) {
        return hostelroomRepo.save(hostelroom);
    }

    public HostelRoom findHostelRoomById(Long id) {
        return hostelroomRepo.findHostelRoomById(id)
                .orElseThrow(() -> new RoomNotFound("HostelRoom by id " + id + " was not found"));
    }

    public void deleteHostelRoom(Long id){
        hostelroomRepo.deleteHostelRoomById(id);
    }

}