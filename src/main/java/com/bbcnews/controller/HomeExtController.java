package com.bbcnews.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/bbc")
public class HomeExtController {

    static final String API_KEY = "ef2c3c9f61194ec49c3bf540a7708165";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/newsInShort")
    public Object newsINShort(@RequestParam String category) {
        String url = "https://inshortsapi.vercel.app/news?category=" + category;
        return restTemplate.getForObject(url
                , Object.class);
    }

    @GetMapping("/breakingNews")
    public Object getBreakingNews(@RequestParam String country) {
        String baseUrl = "https://newsapi.org/v2/top-headlines?country=" + country + "&page=1&";
        String apiKey = "apiKey=" + API_KEY;
        String url = baseUrl + apiKey;
        return restTemplate.getForObject(url,
                Object.class);
    }

    @GetMapping("/topic")
    public Object topic(@RequestParam String q) {

        LocalDate currentDate = LocalDate.now();
        String baseUrl = "https://newsapi.org/v2/everything?q=" + q + "&from=" +
                currentDate + "+&sortBy=publishedAt&";
        String apiKey = "apiKey=" + API_KEY;
        String url = baseUrl + apiKey;
        return restTemplate.getForObject(url
                , Object.class);
    }

    @GetMapping("/headlines")
    public Object headlines(@RequestParam String q) {
        String baseUrl = "https://api.nytimes.com/svc/search/v2/articlesearch.json?q=" + q;
        String apiKey = "&api-key=JlslRyzODmDGRTHOAGfwCKfPrawZ7dLM";
        String url = baseUrl + apiKey;
        System.out.println(url);
        return restTemplate.getForObject(url,
                Object.class);
    }
}


//    "https://newsapi.org/v2/top-headlines?country=us&page=1&apiKey=0b43be1f3dc84b2492d6691164b3edac"
