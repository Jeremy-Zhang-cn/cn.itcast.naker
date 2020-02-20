package com.itheima.controller;

import com.itheima.domain.Patient;
import com.itheima.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class PatientController {

	@Autowired
	private PatientService patientService;

	@RequestMapping(value = "/save", produces = "text/html;charset=utf-8")
	public String save(Patient patient) {

		patientService.save(patient);
		return "subscribe-form";
	}

	@RequestMapping(value = "/listAll", produces = "text/html;charset=utf-8")
	public ModelAndView listAll() {

		ModelAndView mv = new ModelAndView();
		List<Patient> patients = patientService.listAll();

		mv.addObject("patients", patients);
		mv.setViewName("patients-list");
		return mv;
	}

	@RequestMapping("/listLikeName")
	public ModelAndView listLikeName(String name) {

		ModelAndView mv = new ModelAndView();
		List<Patient> patientList = patientService.listByName(name);

		mv.addObject("patientList", patientList);
		mv.setViewName("patients-list");

		return mv;

	}

}
