package ar.edu.unju.fi.ejercicio6;

import java.util.Scanner;

public class Principal6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		int i = 0;
		while (i == 0) {
			System.out.println("Ingrese numero:  ");
			num=scan.nextInt();
			if (num == 6) {
				System.out.println("Alumno regulariza");
			}else if (num >= 7 && num <= 10 ) {
				System.out.println("Alumno promociona");
			}else if (num < 6 && num >= 1) {
				System.out.println("Alumno desaprueba");
			}else{
				System.out.println("Valor no permitido");
				System.out.println("---FIN DE LA APP ---");
				i =1;
		}	
	}
		scan.close();
		
		/*LAS SIGUIENTES LINEAS NOS PARECEN MAS OPTIMAS PERO 
		TIENEN UNA ESTRUCTURA DO-WHILE
		MIENTRAS EL TP PEDIA QUE SEA WHILE
		p/d SI FUNCIONA*/
						
		/*Scanner scan = new Scanner(System.in);
		int num;
		do {
			System.out.println("Ingrese numero:  ");
			num=scan.nextInt();
			if (num == 6) {
				System.out.println("Alumno regulariza");
			}else if (num >= 7 && num <= 10 ) {
				System.out.println("Alumno promociona");
			}else if (num < 6 && num >= 1) {
				System.out.println("Alumno desaprueba");
			}else{
				System.out.println("Valor no permitido");
				System.out.println("---FIN DE LA APP ---");
				System.exit(1);
			}
		} while ((num >= 0 )&&(num < 11)) ;
		scan.close();

		*/
	}

}


