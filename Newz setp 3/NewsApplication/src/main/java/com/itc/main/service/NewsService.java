package com.itc.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.itc.main.model.News;
import com.itc.main.util.exception.NewsAlreadyExistsException;
import com.itc.main.util.exception.NewsNotExistsException;

@Service
public interface NewsService {

	/*
	 * Should not modify this interface. You have to implement these methods in
	 * corresponding Impl classes
	 */
	public News addNews(News news);

	public News getNews(int newsId);

	public List<News> getAllNews();

	public List<News> updateNewsById(News news);

	public void deleteNews(int news);
}

	


