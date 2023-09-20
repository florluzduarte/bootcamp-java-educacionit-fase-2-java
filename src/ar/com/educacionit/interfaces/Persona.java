package ar.com.educacionit.interfaces;

import java.util.Arrays;

public class Persona {
	
	private String nombre;
	private IIdioma idiomaNativo;
	private IIdioma[] otrosIdiomas;
	
	public Persona(String nombre, IIdioma idiomaNativo) {
		this.setNombre(nombre);
		this.setIdiomaNativo(idiomaNativo);
		this.setOtrosIdiomas(new IIdioma[0]);
	}
	
	public void setNombre(String nombre) {
		if(nombre == null) {
			System.err.println("Debe tener un nombre");
		}
		this.nombre = nombre;
	}
	
	public void setIdiomaNativo(IIdioma idiomaNativo) {
		if(idiomaNativo == null) {
			System.err.println("Debe tener un idioma según su país de origen");
		}
		this.idiomaNativo = idiomaNativo;
	}
	
	public void setOtrosIdiomas(IIdioma[] idiomas) {
		this.otrosIdiomas = idiomas;
	}

	public String getNombre() {
		return nombre;
	}

	public IIdioma getIdiomaNativo() {
		return idiomaNativo;
	}

	public IIdioma[] getOtrosIdiomas() {
		return otrosIdiomas;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", idiomaNativo=" + idiomaNativo + ", otrosIdiomas="
				+ Arrays.toString(otrosIdiomas) + "]";
	}
	
	public void decir(String palabras) {
		this.idiomaNativo.decir(palabras);
	}
}
