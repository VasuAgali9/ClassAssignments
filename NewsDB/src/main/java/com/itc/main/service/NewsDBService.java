package com.itc.main.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itc.main.entity.NewsDB;
import com.itc.main.repository.NewsDBRepository;

@Service
public class NewsDBService {
	@Autowired
	private NewsDBRepository newsdbrepository;
	
	public void save(NewsDB newsdb) {
		this.newsdbrepository.save(newsdb);
	}
	public List<NewsDB> getAllNews(){
		return this.newsdbrepository.findAll();
	}
	public List<NewsDB> updateNewsDBById(NewsDB newsdb){
		if(this.newsdbrepository.existsById(newsdb.getNewsId())) {
			this.newsdbrepository.save(newsdb);
			return this.newsdbrepository.findAll();
		}else
			return null;
	}
	public boolean deleteNewsDBById(int id) {
		this.newsdbrepository.deleteById(id);
		return true;
	}
}
