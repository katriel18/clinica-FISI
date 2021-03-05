package com.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.api.model.Specialty;


public interface SpecialtyRepository extends JpaRepository<Specialty, Integer>{
	public List<Specialty> findIsLikeNombreOrderByNombre(String nombre);

}
