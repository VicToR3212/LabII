package tp_V;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;



public class Facultad   {
	
	private  String nombre_c;
    private  int can_alumnos;
	  ArrayList<Estudiante>lista;
	  
	

	public  Facultad () {
		 lista = new ArrayList();
	  }
	 
	 public  Facultad  (String nombre_c,int can_alumnos,ArrayList<Estudiante>lista) {
		
		
		this.lista=lista;
		this.can_alumnos=can_alumnos;
		this.nombre_c=nombre_c;
		
	}

	public String getNombrecole() {
		return nombre_c;
	}

	public void setNombrecole(String nombre) {
		this.nombre_c = nombre;
	}

	public int getCan_alumnos() {
		return can_alumnos;
	}

	 public void setCan_alumnos(int can_alumnos) {
		this.can_alumnos = can_alumnos;
	}
	
	  /*private ArrayList<Estudiante> getLista() {
			return lista;
		}

		private void setLista(ArrayList<Estudiante> lista) {
			this.lista = lista;
		}
	 */
	
	public  void  insertar (int id1 ) {
		
		      
			 String  nombre,apellido;
			 int id=0,nota;
		    String asiastencia;
		 
		    Scanner mer=new Scanner(System.in);
		    System.out.println("ingese el apellido");
		    nombre=mer.next();
		    System.out.println("ingese el nombre");
		    apellido=mer.next();
		    System.out.println("ingese el nota");
		    nota=mer.nextInt();
		    id=id1;
		    System.out.println("ingese el aistio a clase si/no");
		    asiastencia=mer.next();
		 
		   
		lista.add(new Estudiante(nombre,apellido,id,nota, asiastencia));
		       
	}
	
	public void mostrar() {
		String salida="";
		
		for (int i=0 ;i<lista.size();i++){
			   // System.out.println(insertar.lista());
			    
			salida+="\nnombre"+":"+(lista.get(i).getNombre());
			salida+="\napellido"+":"+lista.get(i).getApellido();
			salida+="\nid"+":"+ lista.get(i).getId();
			salida+="\nnota"+":"+lista.get(i).getNota();
			salida+="\nasistencia"+":"+ lista.get(i).getisAsiastencia();
		    salida+="\n"+"\n";	
			
		}
		 System.out.println(salida);
		
		
	}
	
	
	public void modificar() {
		
		
		 Scanner mer=new Scanner(System.in);
		String nom;
		
		 System.out.println("ingrese el nombre para buscar");
		nom=mer.next();
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getNombre().equals(nom)) {
				String nombre,apellido,asiastencia;
				int id ,nota;	
			
			nombre=lista.get(i).getNombre();
			apellido=lista.get(i).getApellido();
			id=lista.get(i).getId();
			asiastencia=lista.get(i).getisAsiastencia();
			System.out.println("modificar nota");
			nota=mer.nextInt();
			
			lista.remove(i);
			lista.add(new Estudiante(apellido,nombre,id ,nota,asiastencia));
			
		}
		}
	}
	
	public  boolean eliminar (boolean r){
		 Scanner mer=new Scanner(System.in);
		String nom;
		System.out.println("ingrese el alumno a  eliminar");
		nom=mer.next();
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getNombre().equals(nom)) {
				lista.remove(i);
				System.out.println("alumno eliminado");
				r=true ;
			}else {
				System.out.println("alumno no encontrado");
			     r=false ;
			}
			 
		}
		
		
		return r;
		
		
		
		
	}
	
	
}
