package com.itc.main.model;


import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;


/*
 * The class "News" will be acting as the data model for the News Table in the database. 
 * Please note that this class is annotated with @Entity annotation. 
 * Hibernate will scan all package for any Java objects annotated with the @Entity annotation. 
 * If it finds any, then it will begin the process of looking through that particular 
 * Java object to recreate it as a table in your database.
 */
@Entity
public class News {

	/*
	 * This class should have ten fields
	 * (newsId,title,author,description, publishedAt, content, url, urlToImage,user,reminder). 
	 * Out of these ten fields, the
	 * field newsId should be primary key and auto-generated. This class should
	 * also contain the getters and setters for the fields along with the no-arg ,
	 * parameterized constructor and toString method. 
	 * annotate user field with @ManyToOne and reminder field as @OneToOne and add
	 * @JsonIgnore for both of them.
	 * 
	 * The data type for publishedAt field should be LocalDateTime. 
	 * Please add @JsonSerialize(using = ToStringSerializer.class) for this field
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int newsId;
	private String title;
	private String author;
	private String description;
	private String content;
	private String url;
	private String urlToImage;
	private LocalDateTime publishedAt;
	
	@ManyToOne
	@JsonIgnore
//	@JoinColumn(name="userId")
	UserProfile user;
	
	@OneToOne
	@JsonIgnore
//	@JoinColumn(name="reminderId")
	Reminder reminder;

	public News() {
		super();
		// TODO Auto-generated constructor stub
	}

	public News(int newsId, String title, String author, String description, String content, String url,
			String urlToImage, LocalDateTime publishedAt, UserProfile user,Reminder reminder ) {
		super();
		this.newsId = newsId;
		this.title = title;
		this.author = author;
		this.description = description;
		this.content = content;
		this.url = url;
		this.urlToImage = urlToImage;
		this.publishedAt = publishedAt;
		this.user = user;
		this.reminder = reminder;
	}

	public UserProfile getUser() {
		return user;
	}

	public void setUser(UserProfile user) {
		this.user = user;
	}

	public Reminder getReminder() {
		return reminder;
	}

	public void setReminder(Reminder reminder) {
		this.reminder = reminder;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrlToImage() {
		return urlToImage;
	}

	public void setUrlToImage(String urlToImage) {
		this.urlToImage = urlToImage;
	}

	public LocalDateTime getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(LocalDateTime publishedAt) {
		this.publishedAt = publishedAt;
	}
	
}
