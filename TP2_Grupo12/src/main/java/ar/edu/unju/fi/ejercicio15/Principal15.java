package ar.edu.unju.fi.ejercicio15;

import java.time.LocalDate;
import java.time.Period;


public class Principal15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona persona = new Persona();
		persona.nombre ="ELIO";
		persona.fechaDeNacimiento=LocalDate.of(1990, 03, 28);
		
		//System.out.println(persona.getEdad()); en caso de usar la funcion getEdad de la clase persona
		
		Period edad = Period.between(persona.fechaDeNacimiento, LocalDate.now());
		System.out.println("edad "+edad.getYears()+" años");          
		
		int dia = persona.fechaDeNacimiento.getDayOfMonth();
		int mes = persona.fechaDeNacimiento.getMonthValue();
		
		if((dia>=21&&mes==3)||(dia<=20&&mes==4))
        {
            System.out.println("Signo del Zodigaco Aries");
        }
        if((dia>=24&&mes==9)||(dia<=23&&mes==10))
        {
            System.out.println("Signo del Zodigaco Libra");
        }
        if((dia>=21&&mes==4)||(dia<=21&&mes==5))
        {
            System.out.println("Signo del Zodigaco Tauro");
        }
        if((dia>=24&&mes==10)||(dia<=22&&mes==11))
        {
            System.out.println("Signo del Zodigaco Escorpio");
        }
        if((dia>=22&&mes==5)||(dia<=21&&mes==6))
        {
            System.out.println("Signo del Zodigaco Geminis");
        }
        if((dia>=23&&mes==11)||(dia<=21&&mes==12))
        {
            System.out.println("Signo del Zodigaco Sagitario");
        }
        if((dia>=21&&mes==6)||(dia<=23&&mes==7))
        {
            System.out.println("Signo del Zodigaco Cancer");
        }
        if((dia>=22&&mes==12)||(dia<=20&&mes==1))
        {
            System.out.println("Signo del Zodigaco Capricornio");
        }
        if((dia>=24&&mes==7)||(dia<=23&&mes==8))
        {
            System.out.println("Signo del Zodigaco Leo");
        }
        if((dia>=21&&mes==1)||(dia<=19&&mes==2))
        {
            System.out.println("Signo del Zodigaco Acuario");
        }
        if((dia>=24&&mes==8)||(dia<=23&&mes==9))
        {
            System.out.println("Signo del Zodigaco Virgo");
        }
        if((dia>=20&&mes==2)||(dia<=20&&mes==3))
        {
            System.out.println("Signo del Zodigaco Piscis");
        }
        
        
        if ((mes==3&&dia>20)||(mes==4&&dia>0)||(mes==5&&dia>0)||(mes==6&&dia<21)) {
        	System.out.println("Estacion Otoño ");
        }else if ((mes==6&&dia>20)||(mes==7&&dia>0)||(mes==8&&dia>0)||(mes==9&&dia<21)) {
        	System.out.println("Estacion Invierno ");
        }else if ((mes==9&&dia>20)||(mes==10&&dia>0)||(mes==11&&dia>0)||(mes==12&&dia<21)) {
        	System.out.println("Estacion Primavera ");
        }else if ((mes==12&&dia>20)||(mes==1&&dia>0)||(mes==2&&dia>0)||(mes==3&&dia<21)) {
        	System.out.println("Estacion Verano ");
        }
	}

}