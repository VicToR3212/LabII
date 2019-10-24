package tpintegrador;

import java.util.Scanner;

public class cinen {

	public static void main(String[] args) {
	

	
	
	espectador[] espectadores = new espectador[2];
	
	for(int i=0; i<=espectadores.length-1; i++) {
		
		Scanner entrada = new Scanner(System.in);
		
		try {
			
			System.out.println("Nombre:");
			String nombre = entrada.next();
			
			System.out.println("Edad:");
			int edad = entrada.nextInt();
			
			System.out.println("Fila:");
			String fila = entrada.next();
			
			System.out.println("Silla:");
			int silla = entrada.nextInt();
			
			espectadores[i] = new espectador(nombre, edad, fila,silla);
			
			salas sala01 = new salas(2, "Sala 01");
			sala01.pelicula("Jocker");
			
			sala01.stespectadoer(espectadores);
			System.out.println(sala01.geteespectador());
			
			acomodadores acomodador01  = new acomodadores("Alberto", 34);
			acomodador01.setsalas(sala01);		
			acomodador01.getsueldo(3000);;
			
			System.out.println(acomodador01.toString());
			
			empleados empleado01 = new empleados("Garcia", 33);
			System.out.println(empleado01.toString());
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR EN EL INGRESO DE DATOS");
			break;
		}
	}		
	

			
	}
}
