package com.organizer_service.organizer_service.Configuration;

import com.organizer_service.organizer_service.dto.OrganizerRequestDTO;
import com.organizer_service.organizer_service.dto.OrganizerResponseDTO;
import com.organizer_service.organizer_service.entity.Organizer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrganizerMapper {

    @Mapping(target = "id",ignore = true)
    @Mapping(target = "createdAt", expression = "java(java.time.LocalDateTime.now())")
    Organizer toEntity(OrganizerRequestDTO dto);
    OrganizerResponseDTO toResponseDTO(Organizer entity);
}
