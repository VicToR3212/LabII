package TpI;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EjercicioI {

	public static void main(String[] args) {
	
	String nom, EDAD;
	int edad;
	Scanner mer =new Scanner(System.in);
	do {
		
		nom=JOptionPane.showInputDialog(null,"nombre");
		
		   EDAD=JOptionPane.showInputDialog(null,"edad"+"\n"+"recordar para salir 0");
		   edad=Integer.parseInt(EDAD);
		//1
		if (edad>=18) {
			System.out.println(nom+" tiene:"+edad+" y es mayor de edad");
		}
		//2
		if(edad<=18 && edad>0) {
			System.out.println(nom+" tiene :"+edad+" y es menor de edad" );
		}
		
		
		
	}while(edad!=0);
	
	
	}

}
