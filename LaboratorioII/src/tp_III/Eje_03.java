package tp_III;

import java.util.Scanner;

public class Eje_03 {

	public static void main(String[] args) {
		String legajo[][]= new String[3][4];
		
		String absol;
	     Scanner mer=new Scanner(System.in);
		for (int i=0;i<3;i++) {
			
			for(int j=0;j<4;j++) {
				if (i==0) {
					
					
					           legajo[0][0]="nombre";
					           if(j>0) {
					        	   System.out.println("ingrese los nombre");
					               absol=mer.next();
					            legajo[i][j]=absol;
					           }
				}
                if (i==1) {
                	
                    
				       legajo[1][0]="dni";
				       if(j>0) {
				     System.out.println("ingrese los dni");
                	 absol=mer.next();
                	 legajo[i][j]=absol;
				       }
				}
                
                if (i==2) {
                	 
                    
				       legajo[2][0]="edad";
				       if(j>0) {
				    System.out.println("ingrese las edades ");
                	  absol=mer.next();
                	 legajo[i][j]=absol;
				       }
                	  }
				}
				
				
			}
		
		
		 
		
		
		
		
		
		
		for (int I=0;I<3;I++) {
			for (int J=0;J<4;J++) {
				 System.out.print("\t"+legajo[I][J]);
			}
			 System.out.println(" ");
			
		}
		
		
		
		

	}

}