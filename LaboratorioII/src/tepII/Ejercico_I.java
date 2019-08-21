package tepII;

import java.util.Scanner;

public class Ejercico_I {

	public static void main(String[] args) {
			int ar[]=new int [10];
			int cont1=0,cont2=0,cont3=0;
			Scanner mer =new  Scanner(System.in);
			
			for (int i=0;i<ar.length;i++) {
				System.out.println("INGRESE UN NUMERO");
				ar[i]=mer.nextInt();
			
			}
		 
			for (int I=0;I<10;I++) {
				System.out.print("\t"+ar[I]);
				if (ar[I]<0) {
					cont1++;
				}
			
				if (ar[I]>0) {
					cont2++;	
				}

				if (ar[I]==0) {
					cont3++;
				}
			}
			
			
			System.out.println("\n"+"la cantidad de numeros negativos son:"+cont1);
			System.out.println("la cantidad de numeros positivos son:"+cont2);
			System.out.println("la cantidad de numeros 0 son:"+cont3);
	}
	
}