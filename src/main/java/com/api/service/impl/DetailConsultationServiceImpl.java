package com.api.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.model.DetailConsultation;
import com.api.repository.DetailConsultationRepository;
import com.api.service.DetailConsultationService;

@Service
public class DetailConsultationServiceImpl implements DetailConsultationService {

	@Autowired
	private DetailConsultationRepository detailConsultationRepository;
	
	@Transactional
	@Override
	public DetailConsultation insertOrUpdate(DetailConsultation entity) {
		return detailConsultationRepository.save(entity);
	}

	@Override
	public Optional<DetailConsultation> getOne(Integer id) {
		return detailConsultationRepository.findById(id);
	}

	@Override
	public List<DetailConsultation> getAll() {
		return detailConsultationRepository.findAll();
	}
	@Transactional
	@Override
	public void delete(Integer id) {
		detailConsultationRepository.deleteById(id);
		
	}
	
	

}
