package com.example.javaweb2.controller;

import org.springframework.ui.Model;
import com.example.javaweb2.model.Note;
import com.example.javaweb2.repository.NoteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class NoteController {
    private final NoteRepository noteRepository;

    public NoteController(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("notes", noteRepository.findAll());
        model.addAttribute("newNote", new Note());
        return "index";
    }

    @PostMapping("/notes")
    public String createNote(@ModelAttribute Note note, RedirectAttributes redirectAttributes) {
        if (note.getTitle() == null || note.getTitle().trim().isEmpty() ||
                note.getContent() == null || note.getContent().trim().isEmpty()) {
            redirectAttributes.addFlashAttribute("error", "Please fill all the fields");
            return "redirect:/";
        }
        noteRepository.save(note);
        redirectAttributes.addFlashAttribute("success", "Note created successfully");
        return "redirect:/";
    }

    @PostMapping("/notes/{id}/delete")
    public String deleteNote(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        noteRepository.deleteById(id);
        redirectAttributes.addFlashAttribute("success", "Note deleted successfully");
        return "redirect:/";
    }
}
