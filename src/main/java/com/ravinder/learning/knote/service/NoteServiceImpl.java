package com.ravinder.learning.knote.service;

import com.ravinder.learning.knote.entity.Note;
import com.ravinder.learning.knote.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    private final NoteRepository noteRepository;

    public NoteServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public Iterable<Note> findAll() {
        List<Note> noteList = (List<Note>) noteRepository.findAll();

        if(noteList.isEmpty()){
            Note note = new Note();
            note.setId((long) 1);
            note.setHeading("Dummy Note");
            note.setDescription("Dummy Note for handling - No Note Found");
            noteList.add(note);
        }
        return noteList;
    }

    @Override
    public void Save(Note note) {
        noteRepository.save(note);
    }

    @Override
    public void deleteById(Long noteId) {
        noteRepository.deleteById(noteId);
    }
}
