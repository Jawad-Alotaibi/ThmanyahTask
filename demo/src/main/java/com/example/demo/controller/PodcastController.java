package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Service.ItunesService;
import com.example.demo.model.Podcast;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class PodcastController {

    private final ItunesService itunesService;

    @GetMapping("/search")
    public List<Podcast> search(@RequestParam String term) {
        return itunesService.searchAndSave(term);
    }
}
