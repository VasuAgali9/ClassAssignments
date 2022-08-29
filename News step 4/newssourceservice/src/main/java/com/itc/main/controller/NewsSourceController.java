package com.itc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itc.main.model.NewsSource;
import com.itc.main.service.NewsSourceService;
import com.itc.main.vo.ResponseTemplate;

@RestController
@RequestMapping("/newssourceservice")
public class NewsSourceController {
	
	@Autowired
	private NewsSourceService newsSourceService;
	
	@PostMapping("/")
	public NewsSource saveNewsSource(@RequestBody NewsSource newsSource) {
		System.out.println(newsSource);
		return this.newsSourceService.saveNewsSource(newsSource);
	}
	
	@GetMapping("/{id}")
	public ResponseTemplate getNewsSourceWithNews(@PathVariable("id") int id) {
		
		return this.newsSourceService.getNewsSourceWIthNews(id);
	}

}
