package ar.edu.unju.fi.ejercicio12;

import java.util.Scanner;

public class Principal12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double g = 9.81;
		double t;
		double h;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la altura: ");
		h= scan.nextDouble();
		scan.close();
		t=Math.sqrt((2*h)/g);
		System.out.println("El tiempo que tarda en caer es: "+t+ " segundos");
	}

}
