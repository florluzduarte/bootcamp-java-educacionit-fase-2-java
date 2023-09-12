package ar.com.educacionit.ciclos;

public class Condicionales {
	//Funcionan igual que los condicionales de JavaScript
	
	public static void main(String[] args) {
		boolean llueve = true;
		//if convencional
		if(llueve) {
			System.out.println("Está lloviendo");
		} else {
			System.out.println("No está lloviendo");
		}
		
		//if/else if...
		int edad = 31;
		if(!llueve) {
			System.out.println("No Llueve");
		} else if (edad == 18) {
			System.out.println("Edad 18 años");
		} else if (edad < 30 && edad >= 20) {
			System.out.println("Estás en tus 20s");
		} else if(edad >= 30 && edad < 40) {
			System.out.println("Estás en tus 30s");
		} else {
			System.out.println("Ninguna de las opciones anteriores");
		}
		
		
		//Switch
		switch(edad) {
			case 18:{
				System.out.println("Tenés 18 años");
				break;
			}
			case 31: {
				System.out.println("Tenés 31 años");
				break;
			}
			default: {
				System.out.println("No sabemos tu edad");
			}
		}
		
		//ternarios
		int nota = 6;
		String notaFinal = (nota >= 7) ? "aprobado" : "desaprobado";
		System.out.println(notaFinal);
	}
}	
