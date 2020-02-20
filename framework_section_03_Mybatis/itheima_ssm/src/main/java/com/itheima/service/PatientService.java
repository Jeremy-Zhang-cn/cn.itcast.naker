package com.itheima.service;

import com.itheima.domain.Patient;

import java.util.List;

public interface PatientService {


	void save(Patient patient);	//录入患者信息

	List<Patient> listAll();	//展示所有用户信息

	List<Patient> listByName(String name); //根据姓名模糊查询


}
