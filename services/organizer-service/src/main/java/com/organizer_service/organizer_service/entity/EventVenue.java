package com.organizer_service.organizer_service.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "event_venue")
@Getter
@Setter
public class EventVenue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id",nullable = false)
    private Event event;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "venue_id",nullable = false)
    private Venue venue;

    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;

    private Double ticketPrice;
    private Integer totalSeats;
    private Integer availableSeats;
}
