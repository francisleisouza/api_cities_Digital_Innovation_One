package com.joinsolutions.api_cities.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joinsolutions.api_cities.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {

	List<State> findByNameContains(String name);	

}
