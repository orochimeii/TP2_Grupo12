package ar.edu.unju.fi.ejercicio2;

import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingrese el año que desea controlar: ");//pide ingresar el año
		int anio = scan.nextInt();//asigna lo que ingresamos por consola a la variable año
		scan.close();
		if (((anio % 4 == 0)&&(anio % 100 != 0))||(anio % 400 == 0)){ //año debe ser divisible por 4 pero no divisible por 100, o debe ser divisible por 100
	         System.out.println(anio+" Si es bisiesto"); //si cumple la condicion es bisiesto
	      }
	      else {
	         System.out.println(anio+" No es bisiesto");//si no la cumple nos avisa que no lo es
	      }

	}

}
