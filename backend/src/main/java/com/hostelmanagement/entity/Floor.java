package com.hostelmanagement.entity;

import lombok.*;
import javax.persistence.*;

@Entity @Table(name="floors") @Getter @Setter @NoArgsConstructor
public class Floor {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
    @Column(nullable=false, unique=true) private Integer floorNumber;
    @Column(nullable=false) private String name;
    private String description;
    public Floor(Integer floorNumber, String name, String description) { this.floorNumber=floorNumber; this.name=name; this.description=description; }
}
