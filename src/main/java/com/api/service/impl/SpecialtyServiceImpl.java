package com.api.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.model.Specialty;
import com.api.repository.SpecialtyRepository;
import com.api.service.SpecialtyService;

@Service
public class SpecialtyServiceImpl implements SpecialtyService{
	
	@Autowired
	private SpecialtyRepository specialtyRepository;
	
	@Transactional
	@Override
	public Specialty insertOrUpdate(Specialty entity) {
		return specialtyRepository.save(entity);
		
	}

	@Override
	public Optional<Specialty> getOne(Integer id) {
		return specialtyRepository.findById(id);
	}

	@Override
	public List<Specialty> getAll() {
		return (List<Specialty>) specialtyRepository.findAll();
	}
	@Transactional
	@Override
	public void delete(Integer id) {
		specialtyRepository.deleteById(id);
		
	}

	@Override
	public List<Specialty> findByNombre(String term) {
		return specialtyRepository.findIsLikeNombreOrderByNombre(term);
	}
	
	

}
