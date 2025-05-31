package com.example.demo.Service;


import com.example.demo.dto.ItunesResponse;
import com.example.demo.model.Podcast;
import com.example.demo.repository.PodcastRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ItunesService {

    private final PodcastRepository podcastRepository;
    private final RestTemplate restTemplate;

   public List<Podcast> searchAndSave(String term) {
    String url = "https://itunes.apple.com/search?media=podcast&term=" + term;

    ItunesResponse response = restTemplate.getForObject(url, ItunesResponse.class);

    if (response == null || response.getResults() == null) {
        System.out.println("❌ No results returned from iTunes API.");
        return List.of();
    }

    System.out.println("✅ Fetched " + response.getResults().size() + " results from iTunes API");

    List<Podcast> podcasts = response.getResults().stream()
            .map(dto -> {
                Podcast podcast = new Podcast();
                podcast.setTrackId(dto.getTrackId());
                podcast.setTrackName(dto.getTrackName());
                podcast.setArtistName(dto.getArtistName());
                podcast.setArtworkUrl600(dto.getArtworkUrl600());
                podcast.setFeedUrl(dto.getFeedUrl());
                podcast.setPrimaryGenreName(dto.getPrimaryGenreName());
                return podcast;
            })
            .collect(Collectors.toList());

    return podcastRepository.saveAll(podcasts);
}

}
