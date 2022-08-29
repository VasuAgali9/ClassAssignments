package com.itc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itc.main.model.News;

@Repository
public interface NewsRepository extends JpaRepository<News, Integer>{
	News findBynewsId(int newsId);

}
