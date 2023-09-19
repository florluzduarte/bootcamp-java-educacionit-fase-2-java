package ar.com.educacionit.polimorfismo;

public class MainPostres {

	public static void main(String[] args) {
		Flan f = new Flan();
		Gelatina g = new Gelatina();

		//Aca casi se da polimorfismo pero las clases no estan relacionadas
		f.temblar();
		g.temblar();
	}

}
