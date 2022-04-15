package ar.edu.unju.fi.ejercicio14;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio13.Empleado;
public class Principal14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado emp1 = new Empleado();
		Empleado emp2 = new Empleado("Ariel",222,145);
		Empleado emp3 = new Empleado("Caro",LocalDate.now(),160);
		Empleado emp4 = new Empleado("Grupo12",200);
		System.out.println("1- Nombre: "+emp1.nombre+"\t \t FechaIng: "+emp1.fechaIngreso+"\t \t Legajo: "+emp1.legajo+"\t \t Email: "+emp1.email+"\t \t Sueldo: "+emp1.sueldo+"\t \t HorasT: "+emp1.horasTrabajadas);
		System.out.println("2- Nombre: "+emp2.nombre+"\t \t FechaIng: "+emp2.fechaIngreso+"\t \t Legajo: "+emp2.legajo+"\t \t Email: "+emp2.email+"\t \t Sueldo: "+emp2.sueldo+"\t \t HorasT: "+emp2.horasTrabajadas);
		System.out.println("3- Nombre: "+emp3.nombre+"\t \t FechaIng: "+emp3.fechaIngreso+"\t \t Legajo: "+emp3.legajo+"\t \t Email: "+emp3.email+"\t \t Sueldo: "+emp3.sueldo+"\t \t HorasT: "+emp3.horasTrabajadas);
		System.out.println("4- Nombre: "+emp4.nombre+"\t \t FechaIng: "+emp4.fechaIngreso+"\t \t Legajo: "+emp4.legajo+"\t \t Email: "+emp4.email+"\t \t Sueldo: "+emp4.sueldo+"\t \t HorasT: "+emp4.horasTrabajadas);

	}

}

