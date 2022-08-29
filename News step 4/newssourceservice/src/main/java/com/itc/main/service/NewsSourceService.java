package com.itc.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.itc.main.model.NewsSource;
import com.itc.main.repository.NewsSourceRepository;
import com.itc.main.vo.News;
import com.itc.main.vo.ResponseTemplate;

@Service
public class NewsSourceService {
	@Autowired
	private NewsSourceRepository newsSourceRepository;
	@Autowired
	private RestTemplate restTemplate;
	
	public NewsSource saveNewsSource(NewsSource newsSource) {
		// TODO Auto-generated method stub
		return this.newsSourceRepository.save(newsSource);
	}

	public ResponseTemplate getNewsSourceWIthNews(int id) {
		// TODO Auto-generated method stub
		ResponseTemplate responseTemplate = new ResponseTemplate();
		NewsSource newsSource = this.newsSourceRepository.findByNewsSourceId(id);
		//invoke News service
		//News news = this.restTemplate.getForObject("http://localhost:7001/newsservice/news/"+newsSource.getNewssourceid(), News.class);
		News news = this.restTemplate.getForObject("http://NEWS-SERVICE/newsservice/news/"+newsSource.getNewssourceId(), News.class);
		responseTemplate.setNewsSource(newsSource);
		responseTemplate.setNews(news);
		return  responseTemplate;
	}
	
}
