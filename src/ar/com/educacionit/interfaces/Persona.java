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
		if (nombre == null) {
			System.err.println("Debe tener un nombre");
		}
		this.nombre = nombre;
	}

	public void setIdiomaNativo(IIdioma idiomaNativo) {
		if (idiomaNativo == null) {
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
	
	public boolean sabeHablarEsteIdioma(IIdioma idioma) {
		boolean habla = false;

		if (this.idiomaNativo.getClass().isAssignableFrom(idioma.getClass())) {
			habla = true;
		}

		for (IIdioma aux : this.otrosIdiomas) {
			if (aux.getClass().isAssignableFrom(idioma.getClass())) {
				habla = true;
			}
		}
		return habla;
	}

	public void decir(String palabras) {
		String aux = palabras.trim();
		if("".equals(aux)) {
			System.err.println("Debe ingresar una frase para hablar");
			return;
		}
		this.idiomaNativo.decir(aux);
	}
	
	public void decir(String palabras, IIdioma idioma) {
		if(idioma == null || !sabeHablarEsteIdioma(idioma)) {
			System.err.println("No sabe hablar: " + idioma.getClass().getSimpleName());
			return;
		}
		idioma.decir(palabras);
	}

	public void aprender(IIdioma idioma) {
		if (idioma == null) {
			System.err.println("Idioma nulo");
			return;
		}
		
		boolean habla = this.sabeHablarEsteIdioma(idioma);
		if(habla) {
			System.err.println("Ya sabe hablar: " + idioma.getClass().getSimpleName());
			return;
		}
		
		IIdioma[] arrayAuxDeIdiomas = new IIdioma[this.otrosIdiomas.length + 1];
		for (int i = 0; i < this.otrosIdiomas.length; i++) {
			arrayAuxDeIdiomas[i] = this.otrosIdiomas[i];
		}
		arrayAuxDeIdiomas[this.otrosIdiomas.length] = idioma;
		this.setOtrosIdiomas(arrayAuxDeIdiomas);
	}
}
