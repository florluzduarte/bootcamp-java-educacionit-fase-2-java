package ar.com.educacionit.mensajero;

public class Sms implements IMensaje {

	@Override
	public void enviar(Mensaje mensaje) {
		System.out.println("Enviando sms: " + mensaje);
	}

}
