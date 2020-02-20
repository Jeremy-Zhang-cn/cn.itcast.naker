package com.itheima.service.impl;

import com.itheima.domain.Patient;
import com.itheima.mapper.PatientMapper;
import com.itheima.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("patientService")
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientMapper patientMapper;

	@Override
	public void save(Patient patient) {
		patientMapper.save(patient);
	}

	@Override
	public List<Patient> listAll() {

		return patientMapper.listAll();

	}

	@Override
	public List<Patient> listByName(String name) {

		return patientMapper.listLikeName("%" + name + "%");

	}
}
