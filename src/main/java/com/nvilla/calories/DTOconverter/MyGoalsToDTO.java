package com.nvilla.calories.DTOconverter;

import javax.annotation.Nullable;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.nvilla.calories.DTO.ExerciseDTO;
import com.nvilla.calories.DTO.ExerciseFoodnotesDTO;
import com.nvilla.calories.DTO.MyGoalsDTO;
import com.nvilla.calories.model.Exercise;
import com.nvilla.calories.model.ExerciseFoodnotes;
import com.nvilla.calories.model.MyGoals;

@Component
public class MyGoalsToDTO implements Converter<MyGoals, MyGoalsDTO> {

	 @Override
	    @Nullable
	    public  MyGoalsDTO convert(@Nullable final  MyGoals myGoals) {
		 		MyGoalsDTO  dto = null;
	        if (myGoals != null) {
	            dto = new  MyGoalsDTO();
	            dto.setId(myGoals.getId());
	            dto.setKilograms(myGoals.getKilograms());
	            dto.setCarbohydrates(myGoals.getCarbohydrates());
	            dto.setFat(myGoals.getFat());
	            dto.setProtein(myGoals.getProtein());
	        }
	        return dto;
	    }

}
