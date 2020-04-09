package com.nvilla.calories.repository;


import javax.annotation.Nonnull;

import org.springframework.data.repository.CrudRepository;

import com.nvilla.calories.model.FitnessUser;
import com.nvilla.calories.model.MyGoals;

public interface MyGoalsRepository extends CrudRepository<MyGoals, Integer> {
	
	
	@Nonnull
    public MyGoals findByUser(@Nonnull FitnessUser user);
}
