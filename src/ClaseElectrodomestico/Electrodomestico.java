package ClaseElectrodomestico;

public class Electrodomestico {
	
	//constantes
	protected final static double precioPorDefecto = 100;
	protected final static String colorPorDefecto = "Blanco";
	protected final static char consumoPorDefecto = 'F';
	protected final static double pesoPorDefecto = 5;
	protected static int idPorDefecto = 1;
		
//	"protected" solo puede accesible por la propia clase o sus clases Hijas
	
//	"final" El valor de esta variable no se puede modificar una vez asignado.
	
//	"static" La variable pertenece a la clase en lugar de a las instancias de la clase, 
	//por lo que puede ser compartida por todas las instancias de la misma clase.
	
	//Atributos
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	protected int id;
	
	
	//Constructores
	public Electrodomestico() {//constructor por defecto
		
		precioBase = precioPorDefecto;
		color = colorPorDefecto;
		consumoEnergetico = consumoPorDefecto;		
		peso = pesoPorDefecto;
		id = idPorDefecto++;
	}
	
	public Electrodomestico(double precio, double peso) {//con dos parametros
		
		precioBase = precio;
		color = colorPorDefecto;
		consumoEnergetico = consumoPorDefecto;		
		this.peso = peso;
		id = idPorDefecto++;
	}
	
	//con todos los parametros
	public Electrodomestico(double precioBase, String color, char letra, double peso) {
		
		this.precioBase = precioBase;
		comprobarColor(color);
		comprobarConsumoEnergetico(letra);
		this.peso = peso;
		id = idPorDefecto++;
		
	}
	
	//getters de todos los atributos
	public static double getPreciopordefecto() {
		return precioPorDefecto;
	}

	public static String getColorpordefecto() {
		return colorPorDefecto;
	}

	public static char getConsumopordefecto() {
		return consumoPorDefecto;
	}

	public static double getPesopordefecto() {
		return pesoPorDefecto;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}
	
	public int getId() {
		return id;
	}

	//Metodos de la clase
	//Comprueba que el color es correcto, sino lo es usa el color por defecto.
	//Se invocara al crear el objeto y no sera visible(privado).
	private void comprobarColor(String color) {
		String colores[] = {"Blanco","Negro", "Rojo","Azul","Gris"};
		boolean encontrado=false;
		
		for(int i=0; i<colores.length && !encontrado; i++) {
			if(colores[i].equalsIgnoreCase(color)) {
				encontrado=true;
			}
		}
		
		if(encontrado) {
			this.color=color;
		}else {
			this.color=colorPorDefecto;
		}
		
	}
	
	 //Comprueba el consumo energetico
     // Solo mayusculas, si es una 'a' no lo detecta como una 'A'
	private void comprobarConsumoEnergetico(char letra) {
		
		 if(letra>=65 && letra<=70){
			 consumoEnergetico = letra;
	        }else{
	        	consumoEnergetico = consumoPorDefecto;
	        }
	}
	
	//precioFinal(): según el consumo energético, aumentara su precio,
	//y según su tamaño, también.	
	public double precioFinal() {
		
		 double plus=0;
	        switch(consumoEnergetico){
	            case 'A':
	                plus+=100;
	                break;
	            case 'B':
	                plus+=80;
	                break;
	            case 'C':
	                plus+=60;
	                break;
	            case 'D':
	                plus+=50;
	                break;
	            case 'E':
	                plus+=30;
	                break;
	            case 'F':
	                plus+=10;
	                break;
	        }
	   
	        if(peso>=0 && peso<19){
	            plus+=10;
	        }else if(peso>=20 && peso<49){
	            plus+=50;
	        }else if(peso>=50 && peso<=79){
	            plus+=80;
	        }else if(peso>=80){
	            plus+=100;
	        }
	   
	        return precioBase+plus;
	    }

	@Override
	public String toString() {
		
		return "\nColor " + color + "\nCarga energetica (" + consumoEnergetico + ")\nPeso= " + peso
				+ " kilos. " + "\nPrecio = " + precioFinal() + " euros.\n";
	}
	
	     
}


