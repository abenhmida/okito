package com.nvilla.calories.repository;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.springframework.data.repository.CrudRepository;

import com.nvilla.calories.model.FitnessUser;


public interface FitnessUserRepository extends CrudRepository<FitnessUser, Integer> {

    @Nullable
    public FitnessUser findByEmailEquals(@Nonnull String email);

}
