package tp_III;




import javax.swing.JOptionPane;

public class Eje_05 {

	public static void main(String[] args) {
		

		
		
		//Scanner mer=new Scanner(System.in);
		int matriz[][]=new int [3][3];
       
	
		 // cargado de matriz 
		 
		for (int i=0;i<3;i++) {
		
			for (int j=0;j<3;j++){
				
				matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
			
			}
		
		}

		   // impresion  por consola desordenada  
		System.out.println(" matriz desordenada");
		for (int i=0;i<3;i++) {
			
			for (int j=0;j<3;j++){
					System.out.print(matriz[i][j]+"\t");
			
			}
			System.out.println(" ");
		
		}
		
		// ordenamiento 
		
		for (int q=0;q<3;q++){
			for(int w=0;w<3;w++) {
				for(int e=0;e<3;e++) {
					for(int r=0;r<3;r++) {
						
						if (matriz[q][w]<=matriz[e][r]) {
							matriz[q][w]=matriz[q][w];
							
						}else {
								int temp=matriz[e][r];
								matriz[e][r]=matriz[q][w];
								matriz[q][w]=temp;
							
							}
						
						
						
						
					
					}
				}
				
			}
			
			
		}
	

		
		
		
		
		
		System.out.println(" matriz ordenada");

		for (int i=0;i<3;i++) {
			
			for (int j=0;j<3;j++){
					System.out.print(matriz[i][j]+"\t");
			
			}
		System.out.println(" ");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
