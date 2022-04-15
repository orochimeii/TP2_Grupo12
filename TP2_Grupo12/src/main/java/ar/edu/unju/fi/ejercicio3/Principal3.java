package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Principal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			System.out.println("Ingrese el "+i+"° numero ");
			int nro = scan.nextInt();
			
			if (nro % 2 == 0) {
				System.out.println(nro+" es PAR");
			}else {
				System.out.println(nro+" es IMPAR");
			}
		}
		scan.close();
		System.out.println("--- App Terminada ---");
	}
}
