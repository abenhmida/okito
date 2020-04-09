package com.nvilla.calories.DTOconverter;

import javax.annotation.Nullable;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.nvilla.calories.DTO.FoodDTO;
import com.nvilla.calories.model.Food;

@Component
public class FoodToDTO implements Converter<Food, FoodDTO> {

	@Override
    @Nullable
    public FoodDTO convert(@Nullable final Food food) {
        FoodDTO dto = null;
        if (food != null) {
            dto = new FoodDTO(
                    food.getId(),
                    (food.getOwner() == null) ? null : food.getOwner().getId(),
                    food.getName(),
                    food.getDefaultServingType(),
                    food.getServingTypeQty(),
                    food.getCalories(),
                    food.getFat(),
                    food.getSaturatedFat(),
                    food.getCarbs(),
                    food.getFiber(),
                    food.getSugar(),
                    food.getProtein(),
                    food.getSodium()
            );
        }
        return dto;
    }

}
