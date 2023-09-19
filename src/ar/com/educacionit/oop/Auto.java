package ar.com.educacionit.oop;

public class Auto {

	/* Atributos */
	private String marca;
	private String modelo;
	private short anio;
	private String color;
	private String patente;
	private short velocidad = 0;

	/* Constructor */
	public Auto(String marca, String modelo, short anio, String color, String patente) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.color = color;
		this.patente = patente;
	}
	
	/* Metodos */
	
	//Polimorfismo por sobre carga. Dos metodos o mas con el mismo nombre pero distintos
	//argumentos
	public void acelerar() {
		this.velocidad++;
	};
	
	public void acelerar(float velocidad) {
		this.velocidad += velocidad;
	};

	public void frenar() {

	};

	public void encender() {

	}

	public short getVelocidad() {
		return this.velocidad;
	};
	
	
}
