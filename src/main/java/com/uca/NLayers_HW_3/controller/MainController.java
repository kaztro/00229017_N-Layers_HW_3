package com.uca.NLayers_HW_3.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@GetMapping(path = "/formulario", produces = MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public String formulario() return "Bienvenido\n" + "Formulario de ingreso de alumnos";
/*	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		//Lista quemada para efectos de ejemplo...
		List<String> lista = new ArrayList<>();
		lista.add("Rojo");
		lista.add("Verde");
		lista.add("Azul");
		
		mav.addObject("hora", Calendar.getInstance().getTime().toString());
		mav.addObject("colores", lista);
		mav.setViewName("clases/clase9/index");
		return mav;
	}*/
}
