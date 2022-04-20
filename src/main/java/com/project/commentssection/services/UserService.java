package com.project.commentssection.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.commentssection.domain.User;
import com.project.commentssection.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	public UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
 }
