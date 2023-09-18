package ar.com.educacionit.ecommerce;

import java.util.Scanner;

public class MainBuscador {
	public static void main(String[] args) {
		Buscador buscador = new Buscador();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Buscar...");
		String claveBuscadaPorUsuario = teclado.next();
		teclado.close();
		
		buscador.setClave(claveBuscadaPorUsuario);
		buscador.buscar();
		
		System.out.println("Hemos encontrado " + buscador.getCantidadItems() + " resultados para la clave " + buscador.getClave());
		
		Resultado[] res = buscador.getResultados();
		
		for (Resultado resultado : res) {
			System.out.println(resultado);
		}
	}
}
