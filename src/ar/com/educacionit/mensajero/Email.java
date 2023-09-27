package ar.com.educacionit.mensajero;

public class Email implements IMensaje {

	@Override
	public void enviar(Mensaje mensaje) {
		System.out.println("Enviando email: " + mensaje);
	}

}
