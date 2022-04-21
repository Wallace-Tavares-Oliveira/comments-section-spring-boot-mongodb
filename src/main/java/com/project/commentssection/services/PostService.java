package com.project.commentssection.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.commentssection.domain.Post;
import com.project.commentssection.repositories.PostRepository;
import com.project.commentssection.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	public PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public List<Post> findByTitle(String text) {
		return repo.findByTitleContainingIgnoreCase(text);
	}
}
