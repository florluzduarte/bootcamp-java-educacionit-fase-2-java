package ar.com.educacionit.polimorfismo;

import ar.com.educacionit.oop.Auto;

public class MainAuto {
	public static void main(String[] args) {
		Auto autoA = new Auto("Ford", "Falcon", (short) 1972, "negro", "srb123");

		autoA.acelerar();
		System.out.println("La velocidad es: " + autoA.getVelocidad());

		autoA.acelerar(5);
		System.out.println("La velocidad es: " + autoA.getVelocidad());
	}
}
