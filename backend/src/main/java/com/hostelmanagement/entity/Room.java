package com.hostelmanagement.entity;

import lombok.*;
import javax.persistence.*;

@Entity @Table(name="rooms") @Getter @Setter @NoArgsConstructor
public class Room {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
    @Column(nullable=false, unique=true) private String roomNumber;
    @ManyToOne(fetch=FetchType.LAZY, optional=false) private Floor floor;
    @Column(nullable=false) private Integer numberOfBeds;
    @Column(nullable=false) private Integer monthlyRent;
    private Integer securityDeposit;
    @Enumerated(EnumType.STRING) private RoomStatus status = RoomStatus.AVAILABLE;
    private String roomType;
    private String description;
    public Room(String roomNumber, Floor floor, Integer numberOfBeds, Integer monthlyRent, Integer securityDeposit, String roomType, String description) { this.roomNumber=roomNumber; this.floor=floor; this.numberOfBeds=numberOfBeds; this.monthlyRent=monthlyRent; this.securityDeposit=securityDeposit; this.roomType=roomType; this.description=description; }
}
