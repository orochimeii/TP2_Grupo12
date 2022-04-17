package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Principal13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleado = new Empleado();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresá la cantidad de horas trabajadas: ");
		empleado.horasTrabajadas = scan.nextInt();
		double sueldo; 
		scan.close();
		
		if (empleado.horasTrabajadas > 160) {
			sueldo=160*600;
			int extras = empleado.horasTrabajadas-160;//calcular la cantidad de hs extra
			int aux=650*extras;//calculamos las horas x su valor
			sueldo=sueldo+aux;
			
		}else {
			sueldo=empleado.horasTrabajadas*600;
		}
		empleado.sueldo=sueldo;
		System.out.println("Al empleado le corresponde cobrar: $"+sueldo);
	}

}
