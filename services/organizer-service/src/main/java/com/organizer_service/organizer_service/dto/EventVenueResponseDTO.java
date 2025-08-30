package com.organizer_service.organizer_service.dto;

import java.time.LocalDateTime;

public class EventVenueResponseDTO {
    private Long id;
    private EventResponseDTO event;   // nested
    private VenueResponseDTO venue;   // nested
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private Double ticketPrice;
    private Integer availableSeats;
}
