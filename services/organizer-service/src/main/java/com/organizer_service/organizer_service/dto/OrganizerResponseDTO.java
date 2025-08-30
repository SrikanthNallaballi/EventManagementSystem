package com.organizer_service.organizer_service.dto;

import java.time.LocalDateTime;

public class OrganizerResponseDTO {
    private Long id;
    private String suffix;
    private String firstName;
    private String lastName;
    private String gender;
    private Integer age;
    private String email;
    private String phoneNumber;
    private String address;
    private String status;        // ACTIVE / INACTIVE / SUSPENDED
    private Boolean isVerified;
    private LocalDateTime lastLogin;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
