package com.itc.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itc.main.model.News;
import com.itc.main.service.NewsService;

@RestController
@RequestMapping("/newsservice")
public class NewsController {
	private static Logger log = LoggerFactory.getLogger(NewsController.class);
    
	@Autowired
	private NewsService nservice;
	
	@PostMapping("/")
	public News saveNews(@RequestBody News news) {
		log.info("Inside the saveNews");
		return nservice.saveNews(news);
	}
	@GetMapping("/news/{id}")
	public News getNewstByID(@PathVariable("id") int id) {
		return nservice.findBynewsId(id);
	}
}
