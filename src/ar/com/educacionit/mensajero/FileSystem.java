package ar.com.educacionit.mensajero;

public class FileSystem implements IMensaje {

	@Override
	public void enviar(Mensaje mensaje) {
		String path = ((Fs)mensaje).getPath();
		String contenido = mensaje.getContenido();
		System.out.println("Grabando mensaje en disco: " + mensaje);
	}

}
