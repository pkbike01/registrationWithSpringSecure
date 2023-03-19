package com.blogapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogapp.entity.Post;
import com.blogapp.payload.PostDto;
import com.blogapp.repository.PostRepository;
@Service
public class PostService_Impl implements PostService {
	
	
	@Autowired
	private PostRepository postRepo;
	
	@Override
	public PostDto createPost(PostDto postDto) {
		//convert Dto to entity
		Post post = mapToEntity(postDto);
		Post newPost = postRepo.save(post);
		
		//convert entity to Dto
		PostDto postResponse = mapToDto(newPost);
		return postResponse;
	}
	
	//convert Entity into Dto
	private PostDto mapToDto(Post post) {
		PostDto postDto = new PostDto();
		postDto.setId(post.getId());
		postDto.setTitle(post.getTitle());
		postDto.setDescription(post.getDescription());
		postDto.setContent(post.getContent());
		return postDto;
		
		
	}	
	
	
	//convert Dto into Entity
	private Post mapToEntity(PostDto postDto) {
		Post post = new Post();
		post.setTitle(postDto.getTitle());
		post.setDescription(postDto.getDescription());
		post.setContent(postDto.getContent());
		
		return post;
	}

	@Override
	public List<PostDto> getAllPost() {
		List<Post> allPost = postRepo.findAll();
		List<PostDto> posts = allPost.stream().map(post->mapToDto(post)).collect(Collectors.toList());
		return posts;
		 
	}
		
		
		
	
	
}
