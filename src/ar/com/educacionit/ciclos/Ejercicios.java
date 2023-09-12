package ar.com.educacionit.ciclos;

import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		// Ingresar la cantidad de pedidos y su valor
		// Calcular el promedio de ventas

		Scanner teclado = new Scanner(System.in); // similar al prompt
		System.out.println("Ingrese la cantidad de pedidos");

		int cantidadDePedidos = teclado.nextInt();
		
		System.out.println("Los pedidos fueron: " + cantidadDePedidos);
		
		float total = 0;
		for(int i=0; i < cantidadDePedidos; i++) {
			System.out.println("Ingrese el costo del pedido " + (i+1));
			float costoDelPedido = teclado.nextFloat();
			total += costoDelPedido;
		}
		
		//Siempre cerrar el teclado por buena práctica
		teclado.close();
		
		float promedio = total / cantidadDePedidos;
		System.out.println("El promedio es: " + promedio);
	}

}
