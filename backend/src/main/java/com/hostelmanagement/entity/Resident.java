package com.hostelmanagement.entity;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;

@Entity @Table(name="residents") @Getter @Setter @NoArgsConstructor
public class Resident {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
    @Column(nullable=false) private String fullName;
    @Column(nullable=false) private String phone;
    private String email;
    private String gender;
    private LocalDate joiningDate;
    private LocalDate dateOfBirth;
    private String emergencyContact;
    private String emergencyContactNumber;
    private String permanentAddress;
    private String idProofType;
    private String idProofNumber;
    private Integer monthlyRent;
    private Integer securityDeposit;
    private Integer rentDueDate;
    @Enumerated(EnumType.STRING) private ResidentStatus status = ResidentStatus.ACTIVE;
    @OneToOne @JoinColumn(name="bed_id", unique=true) private Bed bed;
    public Resident(String fullName, String phone, String email, Integer monthlyRent) { this.fullName=fullName; this.phone=phone; this.email=email; this.monthlyRent=monthlyRent; this.joiningDate=LocalDate.now(); }
}
