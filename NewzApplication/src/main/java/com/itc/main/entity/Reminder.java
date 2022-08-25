package com.itc.main.entity;

import java.time.LocalDateTime;

public class Reminder {
	private int reminderId;
	private LocalDateTime schedule;
	private News news;
	
	public Reminder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reminder(int reminderId, LocalDateTime schedule, News news) {
		super();
		this.reminderId = reminderId;
		this.schedule = schedule;
		this.news = news;
	}

	public int getReminderId() {
		return reminderId;
	}

	public void setReminderId(int reminderId) {
		this.reminderId = reminderId;
	}

	public LocalDateTime getSchedule() {
		return schedule;
	}

	public void setSchedule(LocalDateTime schedule) {
		this.schedule = schedule;
	}

	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}
	
}
