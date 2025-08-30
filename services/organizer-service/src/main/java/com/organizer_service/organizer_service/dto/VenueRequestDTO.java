package com.organizer_service.organizer_service.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class VenueRequestDTO {
    @NotBlank(message = "Venue name is required")
    @Size(max = 100, message = "Venue name cannot exceed 100 characters")
    private String name;

    @NotBlank(message = "Address is required")
    @Size(max = 255, message = "Address cannot exceed 255 characters")
    private String address;

    @NotBlank(message = "City is required")
    private String city;

    @NotBlank(message = "State is required")
    private String state;

    @NotBlank(message = "Country is required")
    private String country;

//    @Pattern(
//            regexp = "^(https?|ftp)://[^\\s/$.?#].[^\\s]*$",
//            message = "Invalid Google Maps URL"
//    )
    private String googleMapsUrl;

    @NotNull(message = "Capacity is required")
    @Min(value = 1, message = "Capacity must be at least 1")
    private Integer capacity;
}
