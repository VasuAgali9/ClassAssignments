package com.itc.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NewsService")
public class News {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int newsId;
	private String title;
	private String author;
	private String description;
	private String content;
	public News() {
		super();
		// TODO Auto-generated constructor stub
	}
	public News(int newsId, String title, String author, String description, String content) {
		super();
		this.newsId = newsId;
		this.title = title;
		this.author = author;
		this.description = description;
		this.content = content;
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
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", title=" + title + ", author=" + author + ", description=" + description
				+ ", content=" + content + "]";
	}
	

}
