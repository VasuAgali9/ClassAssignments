package com.itc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itc.main.entity.News;

public interface NewsRepository extends JpaRepository<News,Integer>  {

}
