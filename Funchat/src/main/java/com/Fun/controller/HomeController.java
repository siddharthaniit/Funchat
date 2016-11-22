package com.Fun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Funchat.dao.UserDetailsDao;
import com.Funchat.model.UserDetails;

@RestController
public class HomeController {
@Autowired
UserDetailsDao userdetailsdao;
@RequestMapping(value="/adduser",method=RequestMethod.POST,headers="Accept=application/json")

public void adduser(@RequestBody UserDetails userdetails)
{
	userdetailsdao.adduser(userdetails);
}
}
