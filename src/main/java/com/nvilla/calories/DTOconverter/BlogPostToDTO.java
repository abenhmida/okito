package com.nvilla.calories.DTOconverter;

import javax.annotation.Nullable;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.nvilla.calories.DTO.BlogPostDTO;
import com.nvilla.calories.DTO.ExercisePerformedDTO;
import com.nvilla.calories.model.BlogPost;
import com.nvilla.calories.model.ExercisePerformed;

@Component
public final class BlogPostToDTO implements Converter<BlogPost, BlogPostDTO>{

	 @Override
	    @Nullable
	    public BlogPostDTO convert(@Nullable final BlogPost blogPost) {
		 		BlogPostDTO  dto = null;
	        if (blogPost != null) {
	            dto = new BlogPostDTO();
	            dto.setId(blogPost.getId());
	            dto.setContent(blogPost.getContent());
	            dto.setDate(blogPost.getDate());
	            dto.setTitle(blogPost.getTitle());
	            dto.setSummary(blogPost.getSummary());
	            dto.setTags(blogPost.getTags());
	            dto.setCategory(blogPost.getCategory());
	        }
	        return dto;
	    }

}
