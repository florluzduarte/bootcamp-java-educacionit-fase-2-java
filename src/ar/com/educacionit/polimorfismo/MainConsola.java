package ar.com.educacionit.polimorfismo;

public class MainConsola {
	public static void main(String[] args) {
		Play play1 = new Play("12345", "gris", 1, 1998, false, 32, false);
		Play play2 = new Play("123456", "negro", 2, 2000, false, 64, false);
		Play play5 = new Play("23456", "blanco", 5, 2020, true, 64, true);
		
		Xbox xbox360 = new Xbox("7890", "negro", 2015, true, 500, true);
		
		//Ahora puedo invocar los métodos play de cada consola
		play1.play();
		play2.play();
		play5.play();
		xbox360.play();
		
		Object[] consolas = new Object[] {play1, play2, play5, xbox360};
		
		for(Object o : consolas) {
			((Consola)o).play();
			if(o.getClass().isAssignableFrom(Play.class)) {
				Play p = (Play)o;
				System.out.println(p.getFabricante());
			}
			if(o instanceof Xbox x) {
				System.out.println(x.getFabricante());
			}
		}
	}
}
