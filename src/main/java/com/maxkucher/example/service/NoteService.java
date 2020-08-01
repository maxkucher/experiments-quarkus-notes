package com.maxkucher.example.service;

import com.maxkucher.example.data.domains.Note;

import java.util.List;
import java.util.UUID;

public interface NoteService {
    List<Note> getAll();

    Note getById(UUID id);

    Note saveNote(Note note);
}
