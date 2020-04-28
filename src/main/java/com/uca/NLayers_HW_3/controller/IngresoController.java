package com.uca.NLayers_HW_3.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IngresoController {
	
	@RequestMapping("/ingresar")
	public String index() {
		return "commons/index";
	}
	
	@RequestMapping("/ingreso")
	public ModelAndView ingreso(HttpServletRequest r) throws ParseException {
		ModelAndView mV = new ModelAndView();
		String nombres = r.getParameter("nombres");
		String apellidos = r.getParameter("apellidos");
		String fN = r.getParameter("fN");
		String lN = r.getParameter("lN");
		String coleProc = r.getParameter("coleProc");
		String tF = r.getParameter("tF");
		String tM = r.getParameter("tM");
		
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = date.parse(fN);
		Date d2 = date.parse("2020-04-28"); 
		
	
		ArrayList<String> alum = new ArrayList<>();
		String noErrores = "Alumno ingresado con exito";
		
		
		if(nombres == null || nombres.length() < 1 || nombres.length() > 25) { 
			alum.add("La longitud del nombre debe ser de max. 25 caracteres y min. 1 caracter...");
		}
		
		if(apellidos == null || apellidos.length() < 1 || apellidos.length() > 25) {
			alum.add("La longitud del apellido debe ser de max. 25 caracteres y min. 1 caracter...");
		}
		
		if(d1 == null || d1.compareTo(d2) < 0) {
			alum.add("Debes tener por lo menos 17 aneos (Mayor al 1 de Enero de 2003)");
		} 
		
		if(lN == null || lN.length() < 1 || lN.length() > 25) {
			alum.add("La longitud del nombre del lugar donde naciste debe ser de max. 25 caracteres y min. 1 caracter...");
		}
		
		if(coleProc == null || coleProc.length() < 1 || coleProc.length() > 100) {
			alum.add("La longitud del nombre del lugar donde estudiaste debe ser de max. 25 caracteres y min. 1 caracter...");
		}
		
		if(tF == null || tF.length()!= 8) {
			alum.add("La longitud de numero de linea fija debe ser de no mas y no menos que de 8 digitos");
		}
		
		if(tM == null || tM.length()!= 8) {
			alum.add("La longitud de numero de linea fija debe ser de no mas y no menos que de 8 digitos");
		}
	
		if(alum.isEmpty()) {
			mV.addObject("Alumno ingresado con exito", noErrores);
			mV.setViewName("commons/exito");
		} else {
			mV.addObject("Alumno no ingresado con exito", alum);
			mV.setViewName("commons/error");
		}

		return mV;
	}
}
