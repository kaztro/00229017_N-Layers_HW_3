package com.uca.NLayers_HW_3.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca._NLayers_HW_3.domain.Alumno;

@Controller
public class MainController {
	
	@GetMapping("/ingresar")
	public String enviarForm(Alumno alumno) {
		return "ingreso";
	}
	
	
	
	@PostMapping("/validForm")
	public ModelAndView procesar(@Valid @ModelAttribute Alumno alumno, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) {
			mav.setViewName("fail");
		}else {
			mav.setViewName("exito");
			mav.addObject("alumno", alumno);
		}		
		
		return mav;
	}
}
