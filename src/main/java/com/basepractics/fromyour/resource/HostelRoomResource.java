package com.basepractics.fromyour.resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.basepractics.fromyour.model.HostelRoom;
import com.basepractics.fromyour.service.HostelRoomService;

import java.util.List;

@RestController
@RequestMapping("/rooms")

public class HostelRoomResource {
    private final HostelRoomService hostelroomService;

    public HostelRoomResource(HostelRoomService hostelroomService) {
        this.hostelroomService = hostelroomService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<HostelRoom>> getAllHostelRooms () {
        List<HostelRoom> hostelrooms = hostelroomService.findAllHostelRooms();
        return new ResponseEntity<>(hostelrooms, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<HostelRoom> getHostelRoomById (@PathVariable("id") Long id) {
        HostelRoom hostelroom = hostelroomService.findHostelRoomById(id);
        return new ResponseEntity<>(hostelroom, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<HostelRoom> addHostelRoom(@RequestBody HostelRoom hostelroom) {
        HostelRoom newHostelRoom = hostelroomService.addHostelRoom(hostelroom);
        return new ResponseEntity<>(newHostelRoom, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<HostelRoom> updateHostelRoom(@RequestBody HostelRoom hostelroom) {
        HostelRoom updateHostelRoom = hostelroomService.updateHostelRoom(hostelroom);
        return new ResponseEntity<>(updateHostelRoom, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteHostelRoom(@PathVariable("id") Long id) {
        hostelroomService.deleteHostelRoom(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
