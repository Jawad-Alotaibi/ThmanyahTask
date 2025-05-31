package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Podcast;

public interface PodcastRepository extends JpaRepository<Podcast, Long> {
    
}
