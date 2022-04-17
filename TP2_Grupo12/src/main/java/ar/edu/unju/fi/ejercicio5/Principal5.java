package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Principal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		do {
			System.out.println("Ingrese numero:  ");
			num=scan.nextInt();
			
			switch (num) {
			case 1:
				System.out.println("ENERO");
				break;
			case 2: 
				System.out.println("FEBRERO");
				break;
			case 3: 
				System.out.println("MARZO");
				break;
			case 4:
				System.out.println("ABRIL");
				break;
			case 5:
				System.out.println("MAYO");
				break;
			case 6:
				System.out.println("JUNIO");
				break;
			case 7:
				System.out.println("JULIO");
				break;
			case 8:
				System.out.println("AGOSTO");
				break;
			case 9:
				System.out.println("SEPTIEMBRE");
				break;
			case 10:
				System.out.println("OCTUBRE");
				break;
			case 11:
				System.out.println("NOVIEMBRE");
				break;
			case 12:
				System.out.println("DICIEMBRE");
				break;
			default:
				System.out.println("no existe ese mes");
				System.out.println("---FIN DE LA APP ---");
				System.exit(1);
			}
			
		} while ((num >= 1 )&&(num<=12)) ;
		scan.close();

	}

}
