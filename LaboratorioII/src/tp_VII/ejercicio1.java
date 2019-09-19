package tp_VII;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio1 {
	
	public static void main (String[] args ) {
		
	Scanner mer =new Scanner(System.in);	
		int m;
	
	System.out.println(" ingrese un unmero ");
	
	
	try{
		
		m=mer.nextInt();
		if(0==(m%2)) {
		System.out.println("lu número  "+m+" es par ");
		}else{
			System.out.println("lu número  "+m+" es impar ");
		}
		} catch(InputMismatchException e) {
		
			System.out.println("valor no numerico");
		}
	
	
	}
}
