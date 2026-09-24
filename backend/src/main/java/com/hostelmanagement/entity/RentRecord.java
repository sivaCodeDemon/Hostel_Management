package com.hostelmanagement.entity;

import lombok.*;
import javax.persistence.*;
import java.time.*;

@Entity @Table(name="rent_records", uniqueConstraints=@UniqueConstraint(columnNames={"resident_id","billingMonth"})) @Getter @Setter @NoArgsConstructor
public class RentRecord {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
    @ManyToOne(optional=false) private Resident resident;
    @Column(nullable=false) private String billingMonth;
    @Column(nullable=false) private Integer rentAmount;
    private Integer amountPaid = 0;
    private LocalDate dueDate;
    private LocalDate paymentDate;
    @Enumerated(EnumType.STRING) private PaymentStatus status = PaymentStatus.PENDING;
    @Enumerated(EnumType.STRING) private PaymentMethod paymentMethod;
    private String transactionNumber;
    private String notes;
    public Integer getBalance() { return Math.max(0, rentAmount - (amountPaid == null ? 0 : amountPaid)); }
}
