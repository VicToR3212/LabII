package tp_IV;

public class CuntaCorriente {

	private double saldo ;
	private String nombre_titular;
	private long numnero_decunta;
	public CuntaCorriente() {
		
	}
	
	public CuntaCorriente(double saldo,String nombre_titular,long numnero_decunta) {
		
		this.saldo=saldo;
		this.nombre_titular=nombre_titular;
		this.numnero_decunta=numnero_decunta;
			
		
		
		
	}
	
	
	
	
	

	public void setSaldo(double saldo) {
		
		this.saldo = saldo;
	}
	
public double getSaldo() {
		
	return 	this.saldo;
	}


	public  String getNombre_titular() {
		return nombre_titular;
	}


	public  void setNombre_titular(String nombre_titular) {
		this.nombre_titular = nombre_titular;
	}


	public  long getNumnero_decunta() {
	 
	 
		return numnero_decunta;
	}


	public  void setNumnero_decunta(long numnero_decunta) {
		this.numnero_decunta = numnero_decunta;
	}




	
        public  boolean ingreso (double n){
		boolean ingreo=true;
		if (n<0) {
			ingreo=false;
		}else this.saldo+=n;
		
		 return ingreo;
	}
	
	
	
	public boolean reintegro(double n){
		boolean ringreo=true;
		if (n<0) {
			ringreo=false;
		}else if (saldo>=n) {
			this.saldo-=n;
					}else ringreo =false;
		
		 return ringreo;
	}
	
	
	public boolean tran (CuntaCorriente c,double n) {
		boolean cprrect=true;
		 if(n<0) {
			 cprrect=false;
		 }else if(saldo>=n) {
			 reintegro(n);
			 c.ingreso(n);
		 } else  cprrect= false;
		 
		 return cprrect;
	}
	
	
	
	
	
}
