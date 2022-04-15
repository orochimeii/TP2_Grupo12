package ar.edu.unju.fi.ejercicio15;

import java.time.LocalDate;

public class Persona {
	public String nombre;
	public LocalDate fechaDeNacimiento;
	
	
	
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	/*public int getEdad() {
		int edad; 
		LocalDate hoy = LocalDate.now();
		if(hoy.getMonthValue() < fechaDeNacimiento.getMonthValue()) {
			edad = hoy.getYear() - fechaDeNacimiento.getYear() - 1;
		}else {
			edad = hoy.getYear() - fechaDeNacimiento.getYear();
		}
		return edad;
	}*/
	
}