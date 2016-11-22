package com.Funchat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Blog {
	@Id@GeneratedValue
	private int blogid;
	private String blogtitle;
	private String blogdescription;
	private String date;
	private String postedby;
	private String category;
	public int getBlogid() {
		return blogid;
	}
	public void setBlogid(int blogid) {
		this.blogid = blogid;
	}
	public String getBlogtitle() {
		return blogtitle;
	}
	public void setBlogtitle(String blogtitle) {
		this.blogtitle = blogtitle;
	}
	public String getBlogdescription() {
		return blogdescription;
	}
	public void setBlogdescription(String blogdescription) {
		this.blogdescription = blogdescription;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPostedby() {
		return postedby;
	}
	public void setPostedby(String postedby) {
		this.postedby = postedby;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	

}
