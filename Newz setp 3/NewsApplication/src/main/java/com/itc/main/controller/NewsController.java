package com.itc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.itc.main.model.News;
import com.itc.main.service.NewsService;

import com.itc.main.util.exception.NewsNotExistsException;

@RestController
@RequestMapping("/api/v1/news")
public class NewsController {
	@Autowired
	NewsService newsService;
	
	@GetMapping
	public ResponseEntity<List<News>> getallNews() {
	List<News> newslist=this.newsService.getAllNews();
		return new ResponseEntity<List<News>>(newslist,HttpStatus.OK);
		
	}
	@GetMapping("/{newsId}")
	public ResponseEntity<?> getNewsById(@PathVariable int bid) throws NewsNotExistsException {
		News news = this.newsService.getNews(bid);
		return new ResponseEntity<News>(news,HttpStatus.OK);
	}
	
	@PostMapping()
	public ResponseEntity<News> addNews(@RequestBody News updnews)
 {
		this.newsService.addNews(updnews);
		return new ResponseEntity<News>(updnews,HttpStatus.OK);
	}
	
	@PutMapping("/{newsId}")
	public ResponseEntity<?> updateNewsById(@RequestBody News news) {
		List<News> list=this.newsService.updateNewsById(news);
		if(list!=null) 
			return new ResponseEntity<List<News>>(list,HttpStatus.OK);
		else
			return new ResponseEntity<String>("Resource-Not-Found", HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/{newsId}")
	public ResponseEntity<?> deleteNews(@PathVariable("newsId") Integer bid)
	{
		this.newsService.deleteNews(bid);
		return new ResponseEntity<String>("Deleted succssfully",HttpStatus.OK);
		}

	}
	

