package tp_VII_ejercicio2;

import java.util.Scanner;

public class ejercicio2 {
	
	
	
	public static void main (String[] args) {
		
		ejrcicio2_3 s =new ejrcicio2_3();
		Scanner mer =new Scanner(System.in);
		int num;
		    System.out.println("ingrese un numero entre 1 y 100");
		    num=mer.nextInt();
		try {
			s.vilidado(num);
			
		}catch( jercicio2_2 e){
			 System.out.println(e.getMessage());
			
		}
	}

}
