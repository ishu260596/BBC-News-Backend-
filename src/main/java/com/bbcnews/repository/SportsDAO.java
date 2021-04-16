
package com.bbcnews.repository;

import com.bbcnews.entity.Sports;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportsDAO extends CrudRepository<Sports, Integer> {
}
