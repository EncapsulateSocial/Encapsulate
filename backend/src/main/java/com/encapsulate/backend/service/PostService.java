package com.encapsulate.backend.service;

import java.util.List;

import com.encapsulate.backend.model.Post;
import com.encapsulate.backend.repository.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;
    
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
}
