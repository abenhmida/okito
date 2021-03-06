package com.nvilla.calories.DTOconverter;
import javax.annotation.Nullable;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.nvilla.calories.DTO.ExerciseDTO;
import com.nvilla.calories.model.Exercise;

@Component
public final class ExerciseToDTO implements Converter<Exercise, ExerciseDTO> {

	 @Override
	    @Nullable
	    public ExerciseDTO convert(@Nullable final Exercise exercise) {
	        ExerciseDTO dto = null;
	        if (exercise != null) {
	            dto = new ExerciseDTO(
	                    exercise.getId(),
	                    exercise.getCode(),
	                    exercise.getMetabolicEquivalent(),
	                    exercise.getCategory(),
	                    exercise.getDescription()
	            );
	        }
	        return dto;
	    }

}
