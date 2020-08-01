package com.maxkucher.example.service;

import com.maxkucher.example.data.domains.Note;
import com.maxkucher.example.data.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DatabaseNoteService implements NoteService {

    private final NoteRepository noteRepository;

    @Override
    public List<Note> getAll() {
        return noteRepository.listAll();
    }


    @Override
    public Note getById(UUID id) {
        return noteRepository.findById(id);
    }

    @Override
    public Note saveNote(Note note) {
        noteRepository.persist(note);
        return note;
    }
}
