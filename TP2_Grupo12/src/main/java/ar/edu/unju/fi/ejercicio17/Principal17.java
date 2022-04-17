package ar.edu.unju.fi.ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Principal17 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate fecha1 = LocalDate.of(1986, 11, 5);
		LocalDate fecha2 = LocalDate.of(1988, 7, 14);
		LocalTime tiempo1 = LocalTime.of(14, 15, 45);
		LocalTime tiempo2 = LocalTime.of(22, 15, 45);
		Scanner scanner = new Scanner(System.in);
		ProcesoFecha pf1 = new ProcesoFecha(fecha1, fecha2);
		ProcesoFecha pf2 = new ProcesoFecha(tiempo1, tiempo2);
		ProcesoFecha pf3 = new ProcesoFecha(LocalDateTime.of(fecha1, tiempo1), LocalDateTime.of(fecha2, tiempo2));
		ProcesoFecha pf4 = new ProcesoFecha(LocalDate.of(1988, 7, 14), LocalDate.now());
		ProcesoFecha pf5 = new ProcesoFecha();
		int dias = pf4.contarTiempoTranscurrido().getDays();
		int meses = pf4.contarTiempoTranscurrido().getMonths();
		int anios = pf4.contarTiempoTranscurrido().getYears();
		pf2.setTime1(pf2.getTime1().plusHours(5));
		pf2.setTime2(pf2.getTime2().minusMinutes(20));
		System.out.println("Ingrese una fecha con el siguiente formato dd/MM/yyyy");
		String fecha = scanner.next();
		pf5.setFecha1(LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		LocalDate mas365dias = pf5.getFecha1().plusDays(365);
		System.out.println(mas365dias);
		System.out.println("Ingrese otra fecha con el siguiente formato dd/MM/yyyy");
		try {
			String otraFecha = scanner.next();
			pf5.setFecha2(LocalDate.parse(otraFecha, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		}catch(DateTimeParseException dtpe) {
			System.out.println("Debe ingresar la fecha en formato dd/MM/yyyy");
			String otraFecha = scanner.next();
			pf5.setFecha2(LocalDate.parse(otraFecha, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		}
		LocalDate menos6meses = pf5.getFecha2().minusMonths(6);
		scanner.close();
		System.out.println(menos6meses);
		System.out.println(pf1.getFecha1());
		System.out.println(pf1.getFecha2());
		System.out.println(pf2.getTime1());
		System.out.println(pf2.getTime2());
		System.out.println(pf1.compararFechas());
		System.out.println(pf3.getDateTime1());
		System.out.println(pf3.getDateTime2());
		System.out.println("Han transcurrido " +  anios + " años, " + meses + " meses y " + dias + " días desde la fecha " + pf4.formatearFecha(pf4.getFecha1()) + " hasta la fecha " + pf4.formatearFecha(pf4.getFecha2()));
	}

}