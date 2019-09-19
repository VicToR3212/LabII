package tp_IV;

import java.util.Scanner;

public class UsoCuenta {

	public static void main(String[] args) {
          Scanner mer=new Scanner(System.in);
		CuntaCorriente cuenta1=new CuntaCorriente();
		double saldo ;
		 String nombrer;
		 long numnero;
     
		System.out.println("nombre");
	   nombrer=mer.next();
        
               do{
		System.out.println("saldo");
	    saldo=mer.nextDouble();
               }while(saldo<200 || saldo<0);
		System.out.println("número de cuenta");
		 numnero=mer.nextLong();
		cuenta1.setNombre_titular(nombrer);
		cuenta1.setNumnero_decunta(numnero);
		cuenta1.setSaldo(saldo);
		
		
		
		
		
		System.out.println("                           saldo inicial           ");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("*******************************************************************");
		System.out.printf("numero de cuenta: "+cuenta1.getNumnero_decunta()+"\t");
		System.out.printf("nombre: "+cuenta1.getNombre_titular()+"\t");
		System.out.printf("saldo: "+cuenta1.getSaldo()+"\n");
		System.out.println("*******************************************************************");
		
		
		
		
		CuntaCorriente cuenta2=new CuntaCorriente();
	
		cuenta2.setNombre_titular("metro");
		cuenta2.setNumnero_decunta(12548633);
		cuenta2.setSaldo(1000);
		
		System.out.println("***********************************************************************");
		System.out.printf("numero de cuenta: "+cuenta2.getNumnero_decunta()+"\t");
		System.out.printf("nombre: "+cuenta2.getNombre_titular()+"\t");
		System.out.printf("saldo: "+cuenta2.getSaldo()+"\n");
		System.out.println("***********************************************************************"+"\n");
		System.out.println("                            trnasferencioa           ");
		System.out.println("-------------------------------------------------------------------------");
		
		cuenta1.tran(cuenta2,200);
		System.out.println("*********************************************************");
		System.out.println("nombre: "+cuenta2.getNombre_titular()+"   saldo: "+cuenta2.getSaldo());
		System.out.println("*********************************************************");
		
		System.out.println("*********************************************************");
		System.out.println("nombre: "+cuenta1.getNombre_titular()+"    saldo: "+cuenta1.getSaldo());
		System.out.println("*********************************************************");
		 
	}

}
