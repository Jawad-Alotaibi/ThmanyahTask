package com.example.demo.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name = "podcast")
@Data
public class Podcast {
    @Id
    private Long trackId;
    private String trackName;
    private String artistName;
    private String artworkUrl600;
    private String feedUrl;
    private String primaryGenreName;
    private LocalDateTime releaseDate;

    public void setTrackId(Long trackId) {
        this.trackId = trackId;
    }
    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
    public void setArtworkUrl600(String artworkUrl600) {
        this.artworkUrl600 = artworkUrl600;
    }
    public void setFeedUrl(String feedUrl) {
        this.feedUrl = feedUrl;
    }
    public void setPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
    }
}
 

    
