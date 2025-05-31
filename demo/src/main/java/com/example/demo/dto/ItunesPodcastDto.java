package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItunesPodcastDto {

    @JsonProperty("trackId")
    private Long trackId;

    @JsonProperty("trackName")
    private String trackName;

    @JsonProperty("artistName")
    private String artistName;

    @JsonProperty("artworkUrl600")
    private String artworkUrl600;

    @JsonProperty("feedUrl")
    private String feedUrl;

    @JsonProperty("primaryGenreName")
    private String primaryGenreName;
}
