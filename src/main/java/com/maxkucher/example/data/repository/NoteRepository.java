package com.maxkucher.example.data.repository;

import com.maxkucher.example.data.domains.Note;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class NoteRepository implements PanacheRepositoryBase<Note, UUID> {
}
