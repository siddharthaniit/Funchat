package com.Fun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Funchat.dao.BlogDao;
import com.Funchat.model.Blog;

@RestController
public class BlogController {
	@Autowired
	BlogDao blogdao;
	@RequestMapping(value="/addBlog",headers="Accept=Application/json",method=RequestMethod.POST)
	public void addBlog(@RequestBody Blog blog)
	{
		blogdao.addBlog(blog);
	}
	@RequestMapping(value="/viewBlogs",headers="Accept=Application/json",method=RequestMethod.GET)
	public List<Blog> viewBlogs()
	{
		return blogdao.viewBlogs();
		
	}
	@RequestMapping(value="/updteBlog",headers="Accept=Application/json",method=RequestMethod.PUT)
	public void updateBlog(@RequestBody Blog blog)
	{
		System.out.println("inside update blog");
		blogdao.updateBlog(blog);
	}
	@RequestMapping(value="/deleteBlog/{id}",headers="Accept=Application/json",method=RequestMethod.DELETE)
	public void deleteJob(@PathVariable int id)
	{
		blogdao.deleteBlog(id);
		
	}

}

