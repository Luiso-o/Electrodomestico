package ClaseElectrodomestico;

public class Lavadora extends Electrodomestico {
	
//	constantes
	private final static int cargaPorDefecto=5;
	
	//Atributos
	private int carga;
	private int idLavadora;
	
//	constructores	
	public Lavadora() {//por defecto
		super(precioPorDefecto,colorPorDefecto,consumoPorDefecto,pesoPorDefecto);	
		this.carga = cargaPorDefecto;
		this.idLavadora = super.id;
		
	}
	
	//con dos parametros
	public Lavadora(double precioBase, double peso) {
		
		 super(precioBase,colorPorDefecto,consumoPorDefecto,peso);
		 this.carga = cargaPorDefecto;
		 this.idLavadora = super.id;
	}
	
	//todos los parametros
	public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        
		super(precioBase,color,consumoEnergetico,peso);
        this.carga = carga;
        this.carga = cargaPorDefecto;
        this.idLavadora = super.id;
	
    }

	//getter
	public int getCarga() {
		return carga;
	}
		

	
	//------------------------Metodos------------------------------------------------
	
	//precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 €,
	//sino es así no se incrementara el precio. Llama al método padre 
	//y añade el código necesario. Recuerda que las condiciones que hemos visto en 
	//la clase Electrodomestico también deben afectar al precio.

	 public double precioFinal(){
	      
	        double plus=super.precioFinal();
	  
	        //añadimos el código necesario
	        if (carga>30){
	            plus+=50;
	        }
	  
	        return plus;
	    }


	@Override
	public String toString() {
		return "Lavadora " + "ID #" + idLavadora + "(" +carga + " libras)" + super.toString();
	}	
	 
	 
}
