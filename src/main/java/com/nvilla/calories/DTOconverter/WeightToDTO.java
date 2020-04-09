package com.nvilla.calories.DTOconverter;

import javax.annotation.Nullable;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.nvilla.calories.DTO.WeightDTO;
import com.nvilla.calories.model.Weight;

@Component
public class WeightToDTO implements Converter<Weight, WeightDTO> {
	
	 @Override
	    @Nullable
	    public WeightDTO convert(@Nullable final Weight weight) {
		 WeightDTO  dto = null;
	        if (weight != null) {
	            dto = new WeightDTO();
	            dto.setId(weight.getId());
	            dto.setDate(weight.getDate());
	            dto.setKilograms(weight.getKilograms());
	        }
	        return dto;
	    }
	
	
	
	

}
