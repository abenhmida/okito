package com.nvilla.calories.DTOconverter;

import javax.annotation.Nullable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.nvilla.calories.DTO.BlogPostDTO;
import com.nvilla.calories.DTO.CommentDTO;
import com.nvilla.calories.DTO.ExerciseFoodnotesDTO;
import com.nvilla.calories.model.BlogPost;
import com.nvilla.calories.model.Comment;
import com.nvilla.calories.model.ExerciseFoodnotes;

@Component
public final class ExerciseFoodnotesToDTO  implements Converter<ExerciseFoodnotes, ExerciseFoodnotesDTO>{


	 @Override
	    @Nullable
	    public ExerciseFoodnotesDTO convert(@Nullable final ExerciseFoodnotes exerciseFoodnotes) {
		 		ExerciseFoodnotesDTO  dto = null;
	        if (exerciseFoodnotes != null) {
	            dto = new ExerciseFoodnotesDTO();
	            dto.setId(exerciseFoodnotes.getId());
	            dto.setDate(exerciseFoodnotes.getDate());
	            dto.setContent(exerciseFoodnotes.getContent());
	            dto.setType(exerciseFoodnotes.getType());
	        }
	        return dto;
	    }

}
