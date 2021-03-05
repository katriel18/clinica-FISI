package com.api.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.model.Patient;
import com.api.repository.PatientRepository;
import com.api.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService{
	
	@Autowired
	private PatientRepository patientRepository;

	@Transactional
	@Override
	public Patient insertOrUpdate(Patient entity) {
		
		return patientRepository.save(entity);
	}

	@Override
	public Optional<Patient> getOne(Integer id) {
		return patientRepository.findById(id);
	}

	@Override
	public List<Patient> getAll() {
		return patientRepository.findAll();
	}
	@Transactional
	@Override
	public void delete(Integer id) {
		patientRepository.deleteById(id);
		
	}
	@Override
	public List<Patient> fetchPatientByDni(String dni) throws Exception {
		return patientRepository.findByDni(dni);
	}

}
