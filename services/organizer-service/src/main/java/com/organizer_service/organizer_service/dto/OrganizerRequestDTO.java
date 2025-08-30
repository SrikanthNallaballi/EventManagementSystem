package com.organizer_service.organizer_service.dto;

import jakarta.validation.constraints.*;

public class OrganizerRequestDTO {

    private String suffix;
    @NotBlank(message = "First Name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @NotBlank(message = "Email is Required")
    @Email(message = "Invalid Email format")
    @Size(max = 40,message = "Email cannot exceed 40 Characters")
    private String email;

    @NotBlank(message = "Phone Number is required")
    @Pattern(regexp = "^[0-9]{10,12}$",message = "Phone number must be 10 to 12 digits")
    private String phoneNumber;

    private String gender; // MALE, FEMALE, OTHER

    @Min(value = 1, message = "Age must be at least 1")
    @Max(value = 120, message = "Age cannot exceed 120")
    private Integer age;

    @Size(max = 255, message = "Address cannot exceed 255 characters")
    private String address;
}
