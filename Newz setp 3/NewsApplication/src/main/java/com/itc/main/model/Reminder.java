package com.itc.main.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Entity
public class Reminder {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int reminderId;
	@JsonSerialize(using = ToStringSerializer.class)
	private LocalDateTime schedule;
	@OneToOne
	@JsonIgnore
	private News news;

	public Reminder(int reminderId, LocalDateTime schedule, News news) {
		this.reminderId=reminderId;
		this.schedule=LocalDateTime.now();
		this.news=news;
	}

	public Reminder() {

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

