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
		System.out.println("el n�mero  introducido  es par ");
		}else{
			System.out.println("lu n�mero introducido es impar ");
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
usuario introducir un n�mero.
 El programa debe devolver un 
 mensaje especificando si el n�mero
  introducido por el usuario es par o impar. 
Adem�s, el programa debe controlar la excepci�n 
si el usuario introduce texto en lugar de un valor
 num�rico y debe pedir que ingrese nuevamente el n�mero.
  Esta acci�n se repetir� hasta que el usuario ingrese un n�mero.
   El programa se cerrar�, terminando la ejecuci�n del programa sin hacer nada m�s.

 */