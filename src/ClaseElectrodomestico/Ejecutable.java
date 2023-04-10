package ClaseElectrodomestico;

import java.util.ArrayList;

public class Ejecutable {

	public static void main(String[] args) {
		
		ArrayList<Electrodomestico>lista=new ArrayList<Electrodomestico>();
		
		lista.add(new Lavadora());
		lista.add(new Lavadora(200,50));
		lista.add(new Lavadora(150,60));
		lista.add(new Lavadora(300,30,'A',"Azul",15));
		lista.add(new Lavadora(100,20,'C',"Rojo",10));	
		lista.add(new Television());
		lista.add(new Television(200,20));
		lista.add(new Television(300,20));
		lista.add(new Television(400,20,'A',"Negro",50,true));
		lista.add(new Television(300,30,'D',"Gris",30,true));
			
		
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i)); 
		}
		
	}
	
}

