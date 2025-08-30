package com.organizer_service.organizer_service.service.Impl;

import com.organizer_service.organizer_service.Configuration.OrganizerMapper;
import com.organizer_service.organizer_service.dao.OrganizerDao;
import com.organizer_service.organizer_service.dto.OrganizerRequestDTO;
import com.organizer_service.organizer_service.dto.OrganizerResponseDTO;
import com.organizer_service.organizer_service.entity.Organizer;
import com.organizer_service.organizer_service.service.OrganizerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrganizerServiceImpl implements OrganizerService {
    private final OrganizerDao organizerDao;
    private final OrganizerMapper organizerMapper;

    @Override
    public OrganizerResponseDTO createOrganizer(OrganizerRequestDTO requestDTO) {
        Organizer organizer=organizerMapper.toEntity(requestDTO);
        Organizer saved=organizerDao.save(organizer);
        return organizerMapper.toResponseDTO(saved);
    }
}
