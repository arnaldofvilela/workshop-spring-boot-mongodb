package com.arnaldoneto.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arnaldoneto.workshopmongo.domain.Post;
import com.arnaldoneto.workshopmongo.domain.User;
import com.arnaldoneto.workshopmongo.repository.PostRepository;
import com.arnaldoneto.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		}

}
