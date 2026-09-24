package com.hostelmanagement.dto;
import lombok.*;
public class ApiDtos { @Getter @Setter public static class ResidentRequest { @NonNull private String fullName; @NonNull private String phone; private String email; private Integer monthlyRent; } }
