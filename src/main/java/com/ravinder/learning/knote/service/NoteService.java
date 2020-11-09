package com.ravinder.learning.knote.service;

import com.ravinder.learning.knote.entity.Note;

public interface NoteService {
    Iterable<Note> findAll();
    void Save(Note note);
    void deleteById(Long noteId);
}
