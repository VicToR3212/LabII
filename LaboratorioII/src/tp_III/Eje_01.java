package tp_III;

import java.util.Random;

public class Eje_01 {

	public static void main(String[] args) {
	    int capa=100;
		int array[]=new int[capa];
		 Random ra=new Random();
	         	//escritura
		for (int i=0;i<capa;i++) {
			 array[i]=ra.nextInt(100);
			
		}
		
		//lectura
		for (int coap:array) {
			System.out.print(array[coap]+" ");
			
		}
		
		

	}

}
