package com.uca._NLayers_HW_3.domain;

import javax.validation.constraints.Size;

public class Alumno {
	@Size(min = 1, max = 25, message = "La longitud del nombre debe ser de max. 25 caracteres y min. 1 caracter...")
	private	String nombres;
	
	@Size(min = 1, max = 25, message = "La longitud del apellido debe ser de max. 25 caracteres y min. 1 caracter...")
	private	String apellidos;
	
	
	private	String fNac;
	
	@Size(min = 1, max = 25, message = "La longitud del nombre del lugar donde naciste debe ser de max. 25 caracteres y min. 1 caracter...")
	private	String lNac;
	
	@Size(min = 1, max = 100, message = "La longitud del nombre del lugar donde estudiaste debe ser de max. 25 caracteres y min. 1 caracter...")
	private	String cole;
	
	@Size(min = 8, max = 8, message = "La longitud de numero de linea fija debe ser de no mas y no menos que de 8 digitos")
	private	String telF;
 
	@Size(min = 8, max = 8, message = "La longitud de numero del movil debe ser de no mas y no menos que de 8 digitos")
	private	String telM;
	
	
	
	
	public Alumno(String nombres, String apellidos, String fNac, String lNac, String cole,
			String telF, String telM) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fNac = fNac;
		this.lNac = lNac;
		this.cole = cole;
		this.telF = telF;
		this.telM = telM;
	}




	public String getNombres() {
		return nombres;
	}




	public void setNombres(String nombres) {
		this.nombres = nombres;
	}




	public String getApellidos() {
		return apellidos;
	}




	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}




	public String getfNac() {
		return fNac;
	}




	public void setfNac(String fNac) {
		this.fNac = fNac;
	}




	public String getlNac() {
		return lNac;
	}




	public void setlNac(String lNac) {
		this.lNac = lNac;
	}




	public String getCole() {
		return cole;
	}




	public void setCole(String cole) {
		this.cole = cole;
	}




	public String getTelF() {
		return telF;
	}




	public void setTelF(String telF) {
		this.telF = telF;
	}




	public String getTelM() {
		return telM;
	}




	public void setTelM(String telM) {
		this.telM = telM;
	}
	
	
	
	
	
}

