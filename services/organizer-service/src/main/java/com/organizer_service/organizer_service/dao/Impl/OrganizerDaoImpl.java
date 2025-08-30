package com.organizer_service.organizer_service.dao.Impl;

import com.organizer_service.organizer_service.dao.OrganizerDao;
import com.organizer_service.organizer_service.entity.Organizer;
import com.organizer_service.organizer_service.repository.OrganizerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrganizerDaoImpl implements OrganizerDao {
    private final OrganizerRepository organizerRepository;
    @Override
    public Organizer save(Organizer organizer) {
        return organizerRepository.save(organizer);
    }
}
