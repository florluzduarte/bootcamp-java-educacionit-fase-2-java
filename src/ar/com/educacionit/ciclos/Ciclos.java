package ar.com.educacionit.ciclos;

public class Ciclos {

	public static void main(String[] args) {
		//for
		for(int i=0; i<10 ; i++ ) {
			System.out.println(i);
		}
		
		//while
		int i=0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		//do-while
		int b=0;
		do {
			System.out.println(b++);
		} while(b<10);
		
		//Arrays
		int[] edades = {1,2,3,4,5,6};
		int[] edades2 = new int[6]; //6 = numero de datos a almacenar en el array
		
		//for each
		for(int v : edades) { 
			//se usa cuando no necesitamos para nada el indice al recorrer el array
			System.out.println(v);
		}
		
		for(int x=0; x < edades2.length; x++) {
			edades2[x] = edades[x];
		}
		
		System.out.println(edades2);
	}

}
