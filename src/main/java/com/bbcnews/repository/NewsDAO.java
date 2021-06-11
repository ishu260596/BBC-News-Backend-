package com.bbcnews.repository;
import com.bbcnews.entity.Newsarticle;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsDAO extends CrudRepository<Newsarticle, Integer> {

    @Query("select n from Newsarticle n where n.region= ?1")
    Iterable<Newsarticle> findAllByRegion(String name);

    @Query("select n from Newsarticle n where n.region= ?1 And n.category=?2")
    Iterable<Newsarticle> getNewsByRegionAndCategory(String region, String category);

    @Query("select n from Newsarticle n where n.category= ?1")
    Iterable<Newsarticle> getNewsByCategory(String category);

    @Query("select n from Newsarticle n where n.tags= ?1")
    Iterable<Newsarticle> getNewsTag(String tag);
}


//    @Query("select n,r.regionname from Newsarticle n inner join Region r on r.regionid=n.regid")