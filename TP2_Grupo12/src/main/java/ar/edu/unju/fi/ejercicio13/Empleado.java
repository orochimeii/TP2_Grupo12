package ar.edu.unju.fi.ejercicio13;

import java.time.LocalDate;

public class Empleado {
	public String nombre;
	public LocalDate fechaIngreso;
	public int legajo;
	public String email;
	public double sueldo;
	public int horasTrabajadas;
	
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
		if (legajo == 0) {
			this.legajo=-9999;
		}
		if (fechaIngreso == null) {
			this.fechaIngreso = LocalDate.of(1900, 01, 01);
		}
	}

	public Empleado(String nombre, int legajo, int horasTrabajadas) {
		super();
		this.legajo=legajo;
		this.nombre = nombre;
		this.legajo = legajo;
		this.horasTrabajadas = horasTrabajadas;
		if (fechaIngreso == null) {
			this.fechaIngreso = LocalDate.of(1900, 01, 01);
		}
		if (legajo == 0) {
			this.legajo=-9999;
		}
	}

	public Empleado(String nombre, LocalDate fechaIngreso, int horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.horasTrabajadas = horasTrabajadas;
		if (legajo == 0) {
			this.legajo=-9999;
		}
		if (fechaIngreso == null) {
			this.fechaIngreso = LocalDate.of(1900, 01, 01);
		}
	}

	public Empleado(String nombre, int horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
		if (legajo == 0) {
			this.legajo=-9999;
		}
		if (fechaIngreso == null) {
			this.fechaIngreso = LocalDate.of(1900, 01, 01);
		}
	}
	
	
	
}
