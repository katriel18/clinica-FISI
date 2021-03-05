package com.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.model.Patient;
import com.api.model.Specialty;

public interface PatientRepository extends JpaRepository<Patient,Integer> {
	
	List<Patient> findByDni(String dni);

}
