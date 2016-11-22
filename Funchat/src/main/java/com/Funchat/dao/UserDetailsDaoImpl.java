package com.Funchat.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Funchat.model.UserDetails;

@Transactional
@Repository(value="UserDetailsDao")
public class UserDetailsDaoImpl implements UserDetailsDao{

	@Autowired
	private SessionFactory sessionFactory;
	public void adduser(UserDetails userdetails) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(userdetails);
		
	}

}
