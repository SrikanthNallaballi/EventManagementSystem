package com.organizer_service.organizer_service.repository;

import com.organizer_service.organizer_service.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event,Long> {
    List<Event> findByOrganizerId(Long organizerId);
    List<Event> findByGenre(String genre);
    List<Event> findByLanguage(String language);
}
