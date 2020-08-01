package com.maxkucher.example.web.mappers;

public interface Mapper<Entity, DTO> {
    Entity fromDTO(DTO dto);

    DTO toDTO(Entity entity);
}
