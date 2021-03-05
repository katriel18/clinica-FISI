package com.api.service;

import java.util.List;

import com.api.model.Doctor;
import com.api.model.Patient;
import com.api.model.Specialty;

public interface DoctorService extends CrudService<Doctor>{
	List<Doctor> getBySpecialty(Specialty specialty);
	List<Doctor> fetchDoctorByLastName(String lastName) throws Exception;
}
