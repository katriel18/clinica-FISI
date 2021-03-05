package com.api.service;

import java.util.List;

import com.api.model.MedicalConsultation;
import com.api.model.Patient;


public interface MedicalConsultationService extends CrudService<MedicalConsultation>{
	List<MedicalConsultation> getByPatient(Patient paciente);

}


