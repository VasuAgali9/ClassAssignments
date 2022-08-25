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

import com.itc.main.entity.NewsDB;
import com.itc.main.service.NewsDBService;

@RestController
@RequestMapping("/api/")
public class NewsDBController {
	@Autowired
	private NewsDBService newsdbservice;
	
	//Handlers
	@PostMapping("News")
	public ResponseEntity<String> save(@RequestBody NewsDB newsdb){
		this.newsdbservice.save(newsdb);
		return new ResponseEntity<String>("CREATED", HttpStatus.CREATED);
	}
	@GetMapping("News")
	public ResponseEntity<List<NewsDB>> getAllNewsDB(){
		List<NewsDB> list=this.newsdbservice.getAllNews();
		return new ResponseEntity<List<NewsDB>>(list, HttpStatus.OK);
		
	}
	@PutMapping("News")
	public ResponseEntity updateNewsDBById(@RequestBody NewsDB newsdb) {
		List<NewsDB> list=this.newsdbservice.updateNewsDBById(newsdb);
		if(list!=null) 
			return new ResponseEntity<List<NewsDB>>(list,HttpStatus.OK);
		else
			return new ResponseEntity<String>("Resource-Not-Found", HttpStatus.NOT_FOUND);
	}
	@DeleteMapping("News/{id}")
	public ResponseEntity deleteNewsDBById(@PathVariable int id) {
		boolean b=this.newsdbservice.deleteNewsDBById(id);
		if(b)
			return new ResponseEntity("SUCCESSFULLY DELETED",HttpStatus.OK);
		else
			return new ResponseEntity("Not-Found",HttpStatus.NOT_FOUND);
	}
}
