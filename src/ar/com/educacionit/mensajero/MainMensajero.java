package ar.com.educacionit.mensajero;

public class MainMensajero {
	public static void main(String[] args) {
		Mensajero miMensajero = new Mensajero();
		miMensajero.setMensajeria(MensajeriaBuilder.buildMensajeria());
		String contenidoAEnviar = "Quiero comer pizza de champiñones";
		Mensaje mensaje = MensajeriaBuilder.buildMensaje(Db.getTipo(), "Flor", contenidoAEnviar, "lalalal", "Javier");
		miMensajero.enviarMensaje(mensaje);
	}
}
