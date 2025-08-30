package com.organizer_service.organizer_service.service;

import com.organizer_service.organizer_service.dto.OrganizerRequestDTO;
import com.organizer_service.organizer_service.dto.OrganizerResponseDTO;

public interface OrganizerService {
    OrganizerResponseDTO createOrganizer(OrganizerRequestDTO requestDTO);

}
