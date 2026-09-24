package com.hostelmanagement.entity;
import lombok.*;
import javax.persistence.*;
@Entity @Table(name="users") @Getter @Setter @NoArgsConstructor
public class User { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @Column(nullable=false,unique=true) private String email; @Column(nullable=false) private String password; private String role="ADMIN"; public User(String email,String password){this.email=email;this.password=password;} }
