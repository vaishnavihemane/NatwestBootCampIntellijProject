package com.natwest.BlogProjectForOneToManyMapping.repository;

import com.natwest.BlogProjectForOneToManyMapping.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog,Integer> {
}
