package com.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springapp.model.Note;

public interface NotesRepository extends JpaRepository<Note, Long>{

}
