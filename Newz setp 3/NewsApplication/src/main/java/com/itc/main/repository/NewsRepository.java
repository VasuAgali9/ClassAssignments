package com.itc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.itc.main.model.News;

/*
* This class is implementing the JpaRepository interface for News.
* Annotate this class with @Repository annotation
* */

@Repository 
public interface NewsRepository extends JpaRepository<News, Integer> {

}
