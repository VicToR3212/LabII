package tpintegrador;

public class salas {
 private int capacidad;
 private String nombre;
 private String pelicula;
 espectador[] espectadores;
public salas(int capacidad, String nombre) {
	
	this.capacidad = capacidad;
	this.nombre = nombre;
	
}
 
public void pelicula(String pelicula){
	this.pelicula=pelicula;
}

 public void  stespectadoer(espectador[] espectadores) {
	 if(espectadores.length>this.capacidad) {
		 System.out.println("capacidad superada");
	 }
	 else this.espectadores=espectadores;
 }
 
 public String geteespectador() {
	
	 try {
		 String listado="listado:\n";
		 for(espectador espectador:this.espectadores) {
			 listado+=espectador.toString();
			 
		 }
		 return listado;
		 
	 }catch(Exception e){
		return"sin espectador";
	 }
	 
	
 }
 
public String  tostring(){
	 
	  return "salas capacidad:" +capacidad+ "pelicula:" +pelicula+"NOMBRE:"+nombre;
  }
 
}
