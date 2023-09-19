package ar.com.educacionit.polimorfismo;

public class Consola {
	private String serie;
	public String fabricante;
	protected String nombre;
	protected String color;
	protected int anioDeFabricacion;
	
	public Consola(String serie, String fabricante, String color, String nombre, int anio) {
		this.serie = serie;
		this.fabricante = fabricante;
		this.color = color;
		this.nombre = nombre;
		this.anioDeFabricacion = anio;
	}
	
	public String getNumeroDeSerie() {
		return this.serie;
	}
	
	public String getFabricante() {
		return this.fabricante;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public int getAnioDeFabricacion() {
		return this.anioDeFabricacion;
	}
	
	public void play() {
		System.out.println("Jugando con la consola");
	}
}
