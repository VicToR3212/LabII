package tpintegrador;

public  class acomodadores extends empleados implements paraacomodadores{
	salas salas;
	
	
acomodadores(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}



@Override
public salas getsalas() {
	
	return this.salas;
}

@Override
public void setsalas(salas salas) {
	this.salas=salas;
	
}

public String acomodador() {
	return "acomodador";
}

	
}
