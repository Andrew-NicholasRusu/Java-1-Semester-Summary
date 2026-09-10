package com.example.javaweb2.repository;

import com.example.javaweb2.model.Note;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Repository
public class NoteRepository {
    private final CopyOnWriteArrayList<Note> notes = new CopyOnWriteArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    public List<Note> findAll() {
        return notes.stream()
                .sorted(Comparator.comparing(Note::getCreatedAt).reversed())
                .collect(Collectors.toList());
    }
    public void save(Note note) {
        if (note.getId() == null) {
            note.setId(idGenerator.getAndIncrement());
            note.setCreatedAt(LocalDateTime.now());
            notes.add(note);
        } else {
            notes.removeIf(n -> n.getId().equals(note.getId()));
            note.setCreatedAt(LocalDateTime.now());
            notes.add(note);
        }
    }

    public void deleteById(Long id) {
        notes.removeIf(n -> n.getId().equals(id));
    }
}
