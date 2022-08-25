package com.itc.main.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.itc.main.entity.NewsDB;

public interface NewsDBRepository  extends JpaRepository<NewsDB,Integer>{

}
