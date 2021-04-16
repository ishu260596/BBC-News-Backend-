package com.bbcnews.controller;

import com.bbcnews.entity.*;
import com.bbcnews.service.NewsService;
import com.bbcnews.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bbc")
public class HomeController {

    @Autowired
    private NewsService newsService;
    @Autowired
    private UserService userService;

    @GetMapping("/allUsers")
    public Iterable<User> getAllUsers() {
        return userService.getAllUser();
    }

    @GetMapping("/allCategories")
    public Iterable<Category> getAllCategory() {
        return newsService.getAllCategory();
    }

    @GetMapping("/allRegions")
    public Iterable<Region> getAllRegion() {
        return newsService.getAllRegion();
    }

    @GetMapping("/allSports")
    public Iterable<Sports> getAllSports() {
        return newsService.getAllSports();
    }

    @GetMapping("/world")
    public Iterable<Newsarticle> worldNews() {
        return newsService.getWorldNews();
    }

    @GetMapping("/region")
    public Iterable<Newsarticle> newsByRegion(@RequestParam String name) {
        return newsService.getNewsByRegion(name);
    }

    @GetMapping("/category")
    public Iterable<Newsarticle> newsByCategory(@RequestParam String category) {
        return newsService.getNewsByCategory(category);
    }

    @GetMapping("/region/category")
    public Iterable<Newsarticle> newsByRegionAndCategory(@RequestParam String region,
                                                         @RequestParam String category) {
        return newsService.getNewsByRegionAndCategory(region, category);
    }

}


//1r6MwBlkuCWRKWESySg5F5QaWG8_gJcPtcJW5W9nh5da4dKW
