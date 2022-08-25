package com.itc.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NewsDB")
public class NewsDB {
	@Id
	@Column(name="newsID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int newsId;
	private String title;
	private String author;
	private String description;
	private String content;
	private String urlToImage;
	private String url;
	
	
	public NewsDB() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NewsDB(int newsId, String title, String author, String description, String content, String url, String urlToImage) {
		super();
		this.newsId = newsId;
		this.title = title;
		this.author = author;
		this.description = description;
		this.content = content;
		this.url=url;
	     this.urlToImage=urlToImage;
	}

	public String getUrlToImage() {
		return urlToImage;
	}

	public void setUrlToImage(String urlToImage) {
		this.urlToImage = urlToImage;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}

