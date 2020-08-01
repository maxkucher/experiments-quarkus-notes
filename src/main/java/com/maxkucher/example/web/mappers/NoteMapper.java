package com.maxkucher.example.web.mappers;

import com.maxkucher.example.data.domains.Note;
import com.maxkucher.example.web.dto.NoteDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class NoteMapper implements Mapper<Note, NoteDTO> {

    @Override
    public Note fromDTO(NoteDTO noteDTO) {
        return Note.builder()
                .id(UUID.randomUUID())
                .note(noteDTO.getNote())
                .title(noteDTO.getTitle())
                .build();
    }

    @Override
    public NoteDTO toDTO(Note note) {
        return NoteDTO.builder()
                .id(note.getId())
                .title(note.getTitle())
                .note(note.getNote())
                .build();
    }
}
