package com.itc.main.vo;

import com.itc.main.model.NewsSource;

public class ResponseTemplate {
	private NewsSource newsSource;
	private News news;
	public ResponseTemplate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseTemplate(NewsSource newsSource, News news) {
		super();
		this.newsSource = newsSource;
		this.news = news;
	}
	public NewsSource getNewsSource() {
		return newsSource;
	}
	public void setNewsSource(NewsSource newsSource) {
		this.newsSource = newsSource;
	}
	public News getNews() {
		return news;
	}
	public void setNews(News news) {
		this.news = news;
	}
	
	

}
