package com.organizer_service.organizer_service.repository;

import com.organizer_service.organizer_service.entity.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrganizerRepository extends JpaRepository<Organizer,Long> {

    Optional<Organizer> findByEmail(String email);
    boolean existsByphoneNumber(String phoneNumber);


}
