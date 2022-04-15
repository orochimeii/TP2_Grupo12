package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Principal16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el nro que desea calcular: ");
		int n =scan.nextInt();
		CalculoMatematico.calcularSumatoria(n);
		CalculoMatematico.calcularProductoria(n);
		scan.close();
	}

}
