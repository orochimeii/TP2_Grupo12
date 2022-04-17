package ar.edu.unju.fi.ejercicio1;

import java.util.Scanner;

public class Principal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingrese el valor que desea calcular el factorial (entre 0 y 10):  ");
		int num = scan.nextInt();
		int factorial = 1 ; //por definicion
		scan.close();
		if (num >= 0 && num <= 10) { 
			for (int i=1; i<=num; i++) {
				factorial= factorial*i;
				}
			System.out.println("El factorial de "+num+" es: "+ factorial);
		}else {
			System.out.println("Ingresó un numero fuera del rango entre 0 y 10");
			
		}
		
	}

}
