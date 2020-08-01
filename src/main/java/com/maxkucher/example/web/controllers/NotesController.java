package com.maxkucher.example.web.controllers;

import com.maxkucher.example.web.dto.NoteDTO;
import com.maxkucher.example.web.mappers.NoteMapper;
import com.maxkucher.example.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/notes")
@RequiredArgsConstructor
public class NotesController {

    private final NoteService noteService;

    private final NoteMapper noteMapper;

    @GetMapping
    public List<NoteDTO> getNotes() {
        return noteService.getAll()
                .stream()
                .map(noteMapper::toDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public NoteDTO getNoteById(@PathVariable UUID id) {
        return noteMapper.toDTO(noteService.getById(id));
    }

    @PostMapping
    public NoteDTO createNote(@RequestBody NoteDTO note) {
        var noteEntity = noteMapper.fromDTO(note);
        return noteMapper.toDTO(noteService.saveNote(noteEntity));
    }
}
