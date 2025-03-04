package com.example.repository;

import com.example.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News,Long> {
    boolean existsByTitleAndSource(String title, String source);
}
