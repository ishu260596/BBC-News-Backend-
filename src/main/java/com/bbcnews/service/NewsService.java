package com.bbcnews.service;

import com.bbcnews.entity.Category;
import com.bbcnews.entity.Newsarticle;
import com.bbcnews.entity.Region;
import com.bbcnews.entity.Sports;
import org.springframework.stereotype.Component;

@Component
public interface NewsService {

    Iterable<Newsarticle> getNewsByRegion(String name);

    Iterable<Category> getAllCategory();

    Iterable<Sports> getAllSports();

    Iterable<Region> getAllRegion();

    Iterable<Newsarticle> getNewsByRegionAndCategory(String region, String category);

    Iterable<Newsarticle> getNewsByCategory(String category);

    Iterable<Newsarticle> getWorldNews();

    Iterable<Newsarticle> getNewsTag(String tag);
}
