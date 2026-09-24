package com.hostelmanagement.repository;
import com.hostelmanagement.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
public interface RentRecordRepository extends JpaRepository<RentRecord, Long> { List<RentRecord> findByBillingMonth(String billingMonth); List<RentRecord> findByResidentId(Long residentId); }
