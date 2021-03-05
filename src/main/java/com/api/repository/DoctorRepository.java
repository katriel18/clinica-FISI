package com.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.model.Doctor;
import com.api.model.Patient;
import com.api.model.Specialty;

public interface DoctorRepository extends JpaRepository<Doctor, Integer>{
	List<Doctor> findAllBySpecialty(Specialty specialty);
	List<Doctor> findByLastName(String lastName);
}
