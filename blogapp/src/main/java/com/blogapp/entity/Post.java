package com.blogapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data//it will help me to generate getter/setter and toString method
@NoArgsConstructor
@AllArgsConstructor
public class Post {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="title", nullable=false,unique=true)
	private String title;
	
	@Column(name="description", nullable=false)
	private String description;
	
	@Column(name="content",nullable=false)
	private String content;
	
	
	
	

}
