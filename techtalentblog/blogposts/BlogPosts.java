package com.techtalentsouth.techtalentblog.blogposts;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class BlogPosts {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String title;
	private String author; 
	private String blogEntry; 
	
	//In order for the JPA to do its magic, all @entity 
	//tagged classes must have a no-argument constructor
	
	public BlogPosts() {
		
	}
	
	public BlogPosts(String title, String author, String blogEntry) {
		this.title = title;
		this.author = author;
		this.blogEntry = blogEntry; 
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getBlogEntry() {
		return blogEntry;
	}

	public void setBlogEntry(String blogEntry) {
		this.blogEntry = blogEntry;
	}
	
	@Override
	public String toString() {
		return "BlogPosts [id=" + id + ", title=" + title + ", author=" + author + ", blogEntry=" + blogEntry + "]";
	}
	
	
}
