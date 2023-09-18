package ar.com.educacionit.ecommerce;

import java.util.Arrays;

public class Buscador {
	private String clave;
	private Resultado[] resultados;
	private int cantidadItems; 

	public Buscador() {
		this.resultados = new Resultado[0];
		this.clave = "";
	}

	public void buscar() {

		if (claveVacia()) {
			return;
		}

		// Simulando los datos
		Resultado res1 = new Resultado("MARVEL STUDIOS EL DICCION...", "imagen.png", 13973.25f, "BRAY, ADAM");
		Resultado res2 = new Resultado("NUNCA CORRI SIEMPRE COBRE", "imagen.png", 6990.00f, "OYOLA, LEONARDO A.");
		Resultado res3 = new Resultado("MARVEL: GUIA DE PERSONAJES", "imagen.png", 9490.00f,
				"CATAPULTA, LOS EDITORES DE");

		agregarResultado(res1);
		agregarResultado(res2);
		agregarResultado(res3);

		setResultados(this.resultados);
	}

	private boolean claveVacia() {
		return "".equals(this.clave.trim());
	}

	public void agregarResultado(Resultado res) {
		var resultadosAux = new Resultado[this.resultados.length + 1];
		
		for(int i=0; i < this.resultados.length; i++) {
			resultadosAux[i] = this.resultados[i];
		}
		
		resultadosAux[this.resultados.length] = res;
		setResultados(resultadosAux);
		setCantidadItems();
	}

	public Resultado[] getResultados() {
		return this.resultados;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	private void setResultados(Resultado[] res) {
		if (res == null) {
			this.resultados = new Resultado[0];
		} else {
			this.resultados = res;
		}
	}
	
	public int getCantidadItems() {
		return this.cantidadItems;
	}
	

	private void setCantidadItems() {
		this.cantidadItems = this.resultados.length;
	}
	
	public String getClave() {
		return this.clave;
	}
	
}
