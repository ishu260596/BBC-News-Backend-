package com.bbcnews.service;


import com.bbcnews.entity.Category;
import com.bbcnews.entity.Newsarticle;
import com.bbcnews.entity.Region;
import com.bbcnews.entity.Sports;
import com.bbcnews.repository.CategoryDAO;
import com.bbcnews.repository.NewsDAO;
import com.bbcnews.repository.RegionDAO;
import com.bbcnews.repository.SportsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    NewsDAO newsDAO;
    @Autowired
    CategoryDAO categoryDAO;
    @Autowired
    RegionDAO regionDAO;
    @Autowired
    SportsDAO sportsDAO;

    @Override
    public Iterable<Newsarticle> getNewsByRegion(String name) {
        return newsDAO.findAllByRegion(name);
    }

    @Override
    public Iterable<Category> getAllCategory() {
        return categoryDAO.findAll();
    }

    @Override
    public Iterable<Sports> getAllSports() {
        return sportsDAO.findAll();
    }

    @Override
    public Iterable<Region> getAllRegion() {
        return regionDAO.findAll();
    }

    @Override
    public Iterable<Newsarticle> getNewsByRegionAndCategory(String region, String category) {
        return newsDAO.getNewsByRegionAndCategory(region, category);
    }

    @Override
    public Iterable<Newsarticle> getNewsByCategory(String category) {
        return newsDAO.getNewsByCategory(category);
    }

    @Override
    public Iterable<Newsarticle> getWorldNews() {
        return newsDAO.findAll();
    }
}
