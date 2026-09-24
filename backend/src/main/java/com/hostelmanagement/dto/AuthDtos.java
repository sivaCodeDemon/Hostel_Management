package com.hostelmanagement.dto;
import lombok.*;
public class AuthDtos { @Getter @Setter public static class Login { private String email; private String password; } @Getter @Setter public static class Register { private String email; private String password; } }
