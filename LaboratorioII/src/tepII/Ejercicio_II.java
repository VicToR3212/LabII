package tepII;

import java.util.Scanner;

public class Ejercicio_II {

	public static void main(String[] args) {
			int ar[]=new int [10];
			int acu=0,mod=0;
			Scanner mer =new  Scanner(System.in);
		
			for (int i=0;i<ar.length;i++) {
				System.out.println("INGRESE UN NUMERO");
				ar[i]=mer.nextInt();
		
			}
		
			for (int I=0;I<10;I++) {
			
					if (I>1) {
						mod=I%2;     				
							if(mod==0){
								acu+=ar[I];
					
							}
				
					}
			
			
			}
		    acu*=100;
		    acu=acu/10;
		  
			System.out.println("la media  de numeros pares son del   "+acu+"%");
				
		      

	}

}
