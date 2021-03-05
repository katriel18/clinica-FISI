package com.api.service;

import java.util.List;

import com.api.model.Patient;
import com.api.model.Specialty;

public interface PatientService extends CrudService<Patient>{
	List<Patient> fetchPatientByDni(String dni) throws Exception;

}
