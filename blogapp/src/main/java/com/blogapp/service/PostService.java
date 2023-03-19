package com.blogapp.service;

import java.util.List;

import com.blogapp.payload.PostDto;

public interface PostService {
	PostDto createPost(PostDto postDto);
	
	List<PostDto> getAllPost();
	
	
}
