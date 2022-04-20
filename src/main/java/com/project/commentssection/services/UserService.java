package com.project.commentssection.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.commentssection.domain.User;
import com.project.commentssection.repositories.UserRepository;
import com.project.commentssection.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	public UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}

	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

}
