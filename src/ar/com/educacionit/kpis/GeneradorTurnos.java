package ar.com.educacionit.kpis;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class GeneradorTurnos {
	
	public static Turno[] generarTurnos() {
		String dni;
		String tipoDeTramite;
		int sucursal;
		
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Turno> turnos = new ArrayList<>();
		
		System.out.println("Ingrese DNI");
		dni = teclado.next();
		
		//Cargar turnos mientras no indique DNI = 0
		while(!dni.trim().equals("0")) {
			System.out.println("Ingrese tipo de trámite");
			tipoDeTramite = teclado.next();
			
			System.out.println("Ingrese sucursal");
			sucursal = teclado.nextInt();
			
			LocalDateTime now = LocalDateTime.now();
			
			Turno turno = new Turno(dni, tipoDeTramite, now, sucursal);
			
			turnos.add(turno);
			
			System.out.println("Ingrese DNI");
			dni = teclado.next();
		}
		
		teclado.close();
		
		return turnos.toArray(new Turno[turnos.size()]);
	}
}
