package com.example.demo.controller;

import com.example.demo.model.Podcast;
import com.example.demo.Service.ItunesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class WebController {

    private final ItunesService itunesService;

    @GetMapping("/")
    public String index() {
        return "index"; // maps to src/main/resources/templates/index.html
    }

    @GetMapping("/search-view")
    public String searchView(@RequestParam String term, Model model) {
        List<Podcast> results = itunesService.searchAndSave(term);
        model.addAttribute("results", results);
        model.addAttribute("term", term);
        return "results"; // maps to src/main/resources/templates/results.html
    }
}
