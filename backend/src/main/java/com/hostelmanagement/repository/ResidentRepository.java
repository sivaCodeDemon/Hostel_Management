package com.hostelmanagement.repository;
import com.hostelmanagement.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
public interface ResidentRepository extends JpaRepository<Resident, Long> { List<Resident> findByFullNameContainingIgnoreCaseOrPhoneContaining(String name, String phone); long countByStatus(ResidentStatus status); }
