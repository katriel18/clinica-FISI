package com.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.model.MedicalConsultation;
import com.api.model.Patient;


public interface MedicalConsultationRepository  extends JpaRepository<MedicalConsultation, Integer>{
		
	List<MedicalConsultation> findAllByPatient(Patient patient);
}
