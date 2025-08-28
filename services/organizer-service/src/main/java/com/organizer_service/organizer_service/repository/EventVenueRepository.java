package com.organizer_service.organizer_service.repository;

import com.organizer_service.organizer_service.entity.EventVenue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventVenueRepository extends JpaRepository<EventVenue,Long> {
    List<EventVenue> findByEventId(Long eventId);
    List<EventVenue> findByVenueId(Long venueId);
}
