package ar.com.educacionit.interfaces;

public class MainIdiomas {

	public static void main(String[] args) {
		
		IIdioma espaniol = new Espaniol();
		Persona pepe = new Persona("pepe", espaniol);
		
		pepe.decir("Hola mundo");
	}
}
