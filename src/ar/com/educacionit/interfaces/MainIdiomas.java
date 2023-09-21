package ar.com.educacionit.interfaces;

public class MainIdiomas {

	public static void main(String[] args) {
		
		IIdioma idioma = new Espaniol();
		Persona pepe = new Persona("pepe", idioma);
		
		pepe.decir("Hola mundo");
		
		idioma = new Ingles();
		pepe.aprender(idioma);
		pepe.decir("Hello world", idioma);
	}
}
