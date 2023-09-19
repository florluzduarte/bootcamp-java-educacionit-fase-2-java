package ar.com.educacionit.polimorfismo;

public class DiscoExterno {
	private String name;
	private int capacidad;
	
	public DiscoExterno(String name, int capacidad) {
		super();
		this.name = name;
		this.capacidad = capacidad;
	}

	public String getName() {
		return name;
	}

	public int getCapacidad() {
		return capacidad;
	}

	@Override
	public String toString() {
		return "DiscoExterno [name=" + name + ", capacidad=" + capacidad + "]";
	}
	
}
