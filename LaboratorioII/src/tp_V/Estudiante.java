package tp_V;

public class Estudiante {
	
	private String  nombre,apellido;
	private int id,nota;
    private String asiastencia;
 
    public Estudiante() {
    	
    }
    
    
	public Estudiante( String nombre,String apellido,int id,int nota,String asiastencia){
		this.apellido=apellido;
		this.nombre=nombre;
		this.id=id;
		this.nota=nota;
		this.asiastencia=asiastencia;
		
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNota() {
		return nota;
	}
	
	
	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getisAsiastencia() {
		return asiastencia;
	}

	public void setAsiastencia(String asiastencia) {
		this.asiastencia = asiastencia;
	}
	
	
	
	
}
