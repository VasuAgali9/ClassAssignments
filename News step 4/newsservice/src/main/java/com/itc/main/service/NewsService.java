package com.itc.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itc.main.model.News;
import com.itc.main.repository.NewsRepository;

@Service
public class NewsService {
	@Autowired
	private NewsRepository newsrepository;
	
	public News saveNews(News news) {
		return newsrepository.save(news);

	}
	
	public News findBynewsId(int id) {
		// TODO Auto-generated method stub
		return newsrepository.findBynewsId(id);
	}


}
