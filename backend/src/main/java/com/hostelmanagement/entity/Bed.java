package com.hostelmanagement.entity;

import lombok.*;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity @Table(name="beds", uniqueConstraints=@UniqueConstraint(columnNames={"room_id","bedNumber"})) @Getter @Setter @NoArgsConstructor
public class Bed {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
    @Column(nullable=false) private Integer bedNumber;
    @ManyToOne(fetch=FetchType.LAZY, optional=false) private Room room;
    @Enumerated(EnumType.STRING) private BedStatus status = BedStatus.AVAILABLE;
    @JsonIgnore @OneToOne(mappedBy="bed", fetch=FetchType.LAZY) private Resident resident;
    public Bed(Integer bedNumber, Room room) { this.bedNumber=bedNumber; this.room=room; }
}
