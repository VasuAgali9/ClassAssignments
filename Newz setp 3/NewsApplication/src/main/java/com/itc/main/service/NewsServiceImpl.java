package com.itc.main.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.itc.main.model.News;
import com.itc.main.repository.NewsRepository;
import com.itc.main.util.exception.NewsAlreadyExistsException;
import com.itc.main.util.exception.NewsNotExistsException;

@Service

public class NewsServiceImpl implements NewsService {

	@Autowired
	private NewsRepository NewsRepository;
	
	public News addNews(News news) {
		News New_news=this.NewsRepository.save(news);
		return New_news;
		
	}

	public News getNews(int newsId) {
		java.util.Optional<News> op=this.NewsRepository.findById(newsId);
				if(op!=null) {
					return op.get();
				}else 
				return null;
	}


	public List<News> getAllNews() {
		List<News> News_list=this.NewsRepository.findAll();
		return News_list;
	}


	public List<News> updateNewsById(News news) {

		if (this.NewsRepository.existsById(news.getNewsId())) {
			this.NewsRepository.save(news);
			return (List<News>) this.NewsRepository.findAll();
		}else
		return null;
	}

	public void deleteNews(int newsId) {
	this.NewsRepository.deleteById(newsId);


	}

}

