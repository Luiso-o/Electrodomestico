package ClaseElectrodomestico;

public class Television extends Electrodomestico {

	//constante
	private final static int resolucionPorDefecto=20;
	private final static boolean sintonizadorPorDefecto=false;
	
	//Atributos
	private int resolucion;
	private boolean sintonizador;
	private int idTelevision;
	
	//Constructores
	public Television() {//Por defecto
		
		super(precioPorDefecto,colorPorDefecto,consumoPorDefecto,pesoPorDefecto);	
		resolucion=resolucionPorDefecto;
		sintonizador=sintonizadorPorDefecto;
		idTelevision = super.id;
		
	}
	
	//con dos parametros
	public Television(double precio, double peso) {
		
		super(precio,colorPorDefecto,consumoPorDefecto,peso);	
		resolucion=resolucionPorDefecto;
		sintonizador=sintonizadorPorDefecto;
		idTelevision = super.id;
	}

	  public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
	        
		  	super(precioBase, color, consumoEnergetico, peso);
	        this.resolucion=resolucion;
	        this.sintonizador=sintonizadorTDT;
	        idTelevision = super.id;
	        
	    }
	  
	//getters
	public int getResolucion() {
		return resolucion;
	}

	public boolean getSintonizador() {
		return sintonizador;
	}
	
	public int getIdTelevision() {
		return idTelevision;
	}
	
	
	//precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara 
	//el precio un 30% y si tiene un sintonizador TDT incorporado, aumentara 50 €. 
	//Recuerda que las condiciones que hemos visto en la clase Electrodomestico
	//también deben afectar al precio.
	  
	public double precioFinal(){
	      
	   double plus=super.precioFinal();

	     //añadimos el código necesario
	      if (resolucion>40){
	          plus+=precioBase*03;
	      }else if(sintonizador) {
	    	  plus+=50;
	      }
	  
	      return plus;
	  }

	//Devuelve un mesaje si el televisor tiene o no sintonizador TDT
	private String tieneTDT() {
		if(sintonizador) {
			return "con sintonizador TDT incorporado";
		}else {
			return "sin sintonizador TDT incorporado";
		}
	}

	@Override
	public String toString() {
		return "Television " + "ID #" + idTelevision + "(" + resolucion + "p), " + tieneTDT() + super.toString();
	}	
	 
}
