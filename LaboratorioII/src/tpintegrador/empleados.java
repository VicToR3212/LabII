package tpintegrador;

public class empleados extends persona {

	private double sueldo;
	
	empleados(String nombre,int edad ){
		super.setNombre(nombre);
		super.setEdad(edad);
		
	}

	
	
	
	
	public  void getsueldo (double sueldo) {
		this.sueldo = sueldo;
		
		
	}
	





	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "empleado";
	}

	@Override
	public String toString() {
		
		return "nombre:"+super.getNombre()+"\t"+super.getEdad()+"\t"+this.getTipo()+"\t"+this.sueldo;
	}





	

	
	
}
