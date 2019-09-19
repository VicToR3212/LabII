package tp_V;

import java.util.Scanner;

public class UsoFacultad {

	public static void main(String[] args) {
		Scanner mer=new Scanner(System.in);
		String colegio;
		int can_alumnos;
		Facultad fa=new Facultad();
		System.out.println("INGRESE EL NOMBRE DEL COLEGIO");
		 colegio=mer.next();
		 fa.setNombrecole(colegio);
		 System.out.println("INGRESE LA CANTIDAD DE ALUMNOS");
		can_alumnos=mer.nextInt();
		fa.setCan_alumnos(can_alumnos);
		int 	n=0,s, id=0;
		boolean nom=false ,l= false ;
	
		do {
			System.out.println("INGRESE el numero corespondiente a la accion 1/agregar 2/modificar 3/eliminar 4/mostrar 5/salir"  );
			s=mer.nextInt(); 
			switch(s){
			case 1:
				if (n<can_alumnos) {
                     id++;			
				fa.insertar(id);
				n++;
				}else System.out.println("la cantidad de alumnos es amyor, a la indicada  no puede agragar alumnos sin eliminar ");
				break;
				
			case 2:
				fa.modificar();
				break;
			
			case 3:
				l=fa.eliminar(l);
				if (l== true){
				n--;}
				break;
				
			case 4:
				fa.mostrar();
				break;
			case 5 :
				nom=true;
				break;
			
			default:
				System.out.println("error número no corespondiente");
				break;
			
			
			}
			
			
			
		
		}while(nom!=true);
	}

}
