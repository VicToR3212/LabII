package tp_VII;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JEJERCICIO_3 {

	public static void main(String[] args) {
	

	
	
	Scanner mer =new Scanner(System.in);	
		int m;
		boolean n=true;
	while(n) {
	System.out.println(" ingrese un unmero ");
	
	
	try{
		
		m=mer.nextInt();
		n=false;
		if(0==(m%2)) {
		System.out.println("el número  introducido  es par ");
		}else{
			System.out.println("lu número introducido es impar ");
		}
		
		} catch(InputMismatchException e) {
			mer.nextLine();
			System.out.println("valor no es  numerico"+"\n");
		}
	
	        
	
	}
	
	}

}
/*
 *Ejercicio 03: excepciones
Crea un programa que pida al 
usuario introducir un número.
 El programa debe devolver un 
 mensaje especificando si el número
  introducido por el usuario es par o impar. 
Además, el programa debe controlar la excepción 
si el usuario introduce texto en lugar de un valor
 numérico y debe pedir que ingrese nuevamente el número.
  Esta acción se repetirá hasta que el usuario ingrese un número.
   El programa se cerrará”, terminando la ejecución del programa sin hacer nada más.

 */