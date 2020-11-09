package com.ravinder.learning.knote.repository;

import com.ravinder.learning.knote.entity.Note;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<Note, Long> {
}
