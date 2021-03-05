package com.api.service;

import java.util.List;

import com.api.model.Specialty;

public interface SpecialtyService extends CrudService<Specialty>{
	
	public List<Specialty> findByNombre(String term);

}
