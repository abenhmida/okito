package com.nvilla.calories.repository;

import java.sql.Date;
import java.util.List;

import javax.annotation.Nonnull;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.nvilla.calories.model.FitnessUser;
import com.nvilla.calories.model.Food;
import com.nvilla.calories.model.FoodEaten;





public interface FoodEatenRepository extends CrudRepository<FoodEaten, Integer>{
		
		@Nonnull
	    public List<FoodEaten> findByUserEqualsOrderByDateAsc(@Nonnull FitnessUser user);

		@Nonnull
	    public List<FoodEaten> findByUserEqualsAndFoodEqualsOrderByDateAsc(
	            @Nonnull FitnessUser user,
	            @Nonnull Food food
	    );
		
		
		
		 @Query(
		            "SELECT foodEaten FROM FoodEaten foodEaten, Food food "
		                    + "WHERE foodEaten.food = food "
		                    + "AND foodEaten.user = :user "
		                    + "AND foodEaten.date = :date "
		                    + "ORDER BY food.name ASC")
		    @Nonnull
		    public List<FoodEaten> findByUserEqualsAndDateEquals(
		            @Nonnull @Param("user") FitnessUser user,
		            @Nonnull @Param("date") Date date
		    );
		
		
		
		
	
		 @Query(
		            "SELECT DISTINCT food FROM Food food, FoodEaten foodEaten "
		                    + "WHERE food = foodEaten.food "
		                    + "AND foodEaten.user = :user "
		                    + "AND foodEaten.date BETWEEN :startDate AND :endDate "
		                    + "ORDER BY food.name ASC")
		  	@Nonnull
		    public List<Food> findByUserEatenWithinRange(
		            @Nonnull @Param("user") FitnessUser user,
		            @Nonnull @Param("startDate") Date startDate,
		            @Nonnull @Param("endDate") Date endDate
		    );
		
	
	
	
}
