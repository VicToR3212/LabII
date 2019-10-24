package tpintegrador;

public class espectador extends persona{
	
	private  String fila ;
	private int silla;
	
	espectador(String nombre ,int edad, String fila, int silla){
		 super.setEdad(edad);
		 super.setNombre(nombre);
		 this.fila=fila;
		 this.silla=silla;
	}
	

	public String butaca() {
		
		
		return this.fila +"/"+this.silla;
	}


	@Override
	public String getTipo() {
		
		return "espectador";
	}


	@Override
	public String toString() {
		    
		return "nombre: "
		+super.getNombre()+"\n"
		+"edad"+super.getEdad()+"\n"
		+"tipo"+this.getTipo()+
		"butaca"+this.butaca()+
		"\n"+"____________________________________________\n";
	}
	
}
