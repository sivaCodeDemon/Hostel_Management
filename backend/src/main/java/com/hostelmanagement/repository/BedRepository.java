package com.hostelmanagement.repository;
import com.hostelmanagement.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
public interface BedRepository extends JpaRepository<Bed, Long> { List<Bed> findByRoomId(Long roomId); long countByRoomIdAndStatus(Long roomId, BedStatus status); }
