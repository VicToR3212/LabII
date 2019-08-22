package tp_III;

import java.util.Random;

public class Eje_02 {

	public static void main(String[] args) {
		
			int matriz[][]=new int [3][3];
			
			 Random ra=new Random();
			 
			 // cargado de matriz 
			 
			for (int i=0;i<3;i++) {
			
				for (int j=0;j<3;j++){
					matriz[i][j]=ra.nextInt(100);
				
				}
			
			}
	
			   // impresion  por consola 
			
			for (int i=0;i<3;i++) {
				
				for (int j=0;j<3;j++){
						System.out.print("\t"+matriz[i][j]);
				
				}
				System.out.println(" ");
			
			}
	
			
			

	}
}