package com.nvilla.calories.DTOconverter;

import javax.annotation.Nullable;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.nvilla.calories.DTO.CommentDTO;
import com.nvilla.calories.DTO.ExerciseDTO;
import com.nvilla.calories.DTO.PostDTO;
import com.nvilla.calories.model.Comment;
import com.nvilla.calories.model.Exercise;
import com.nvilla.calories.model.Post;

@Component
public class PostToDTO implements Converter<Post, PostDTO> {

	 @Override
	    @Nullable
	    public PostDTO convert(@Nullable final Post post) {
		 PostDTO  dto = null;
	        if (post != null) {
	            dto = new PostDTO();
	            dto.setId(post.getId());
	            dto.setContent(post.getContent());
	            dto.setDate(post.getDate());
	        }
	        return dto;
	    }

}
