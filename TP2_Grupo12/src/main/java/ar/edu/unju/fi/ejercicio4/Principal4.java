package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Principal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		do {
			System.out.println("Ingrese numero:  ");
			num=scan.nextInt();
			
			if (num == 1) {
				System.out.println("ENERO");
			}else if (num == 2 ) {
				System.out.println("FEBRERO");
			}else if (num == 3) {
				System.out.println("MARZO");
			}else if (num== 4) {
				System.out.println("ABRIL");
			}else if (num== 5) {
				System.out.println("MAYO");
			}else if (num== 6) {
				System.out.println("JUNIO");
			}else if (num== 7) {
				System.out.println("JULIO");
			}else if (num== 8) {
				System.out.println("AGOSTO");
			}else if (num== 9) {
				System.out.println("SEPTIEMBRE");
			}else if (num== 10) {
				System.out.println("OCTUBRE");
			}else if (num== 11) {
				System.out.println("NOVIEMBRE");
			}else if (num== 12) {
				System.out.println("DICIEMBRE");
			}else {
				System.out.println("no existe ese mes");
				System.out.println("---FIN DE LA APP ---");
				System.exit(1);
			}
		} while ((num >= 1 )&&(num<=12)) ;
		scan.close();

	}

}
