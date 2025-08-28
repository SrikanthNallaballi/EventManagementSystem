package com.organizer_service.organizer_service.repository;

import com.organizer_service.organizer_service.entity.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VenueRepository extends JpaRepository<Venue,Long> {
    Optional<Venue> findByNameAndCity(String name,String city);
    boolean existsByNameAndCity(String name,String city);
}
