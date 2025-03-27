package com.example.webapp.controller;


import com.example.webapp.entity.Poem;
import com.example.webapp.service.PoemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class PoemController {

    private final PoemService poemService;

    @GetMapping("/{id}")
    public String showPoem(@PathVariable int id, Model model) {
        Poem poem = poemService.findPoemById(id);

        model.addAttribute("title", poem.getTitle());
        model.addAttribute("author", poem.getAuthor());
        model.addAttribute("contents", poem.getContents().replace("\\n", "<br/>"));
        return "poem";
    }
}