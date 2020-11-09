package com.ravinder.learning.knote.controller;


import com.ravinder.learning.knote.entity.Note;
import com.ravinder.learning.knote.service.NoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class IndexController {

    private final NoteService noteService;

    public IndexController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping
    public String getHome(Model model){
        //send all notes to template
        model.addAttribute("notesList", noteService.findAll());
        return "Index";
    }

    @GetMapping("note/create")
    public String createNote(Model model){
        model.addAttribute("noteObject", new Note());
        return "createnote";
    }

    @PostMapping("note/post")
    public String saveNote(@ModelAttribute Note note){
        noteService.Save(note);
        return "redirect:/";
    }

    @DeleteMapping
    @RequestMapping("note/delete/{id}")
    public String deleteNote(@PathVariable String id){
        noteService.deleteById(Long.valueOf(id));
        return "redirect:/";
    }
}
