package com.basepractics.fromyour.repo;
import com.basepractics.fromyour.model.HostelRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface HostelRoomRepo extends JpaRepository<HostelRoom, Long> {
    void deleteHostelRoomById(Long id);
    Optional<HostelRoom> findHostelRoomById(Long id);
}
