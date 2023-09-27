package ar.com.educacionit.mensajero;

public class Mensajero {

	private IMensaje mensajeria;
	
	public Mensajero() {
		
	}
	
	public void enviarMensaje(Mensaje mensaje) {
		if(this.mensajeria == null) {
			System.err.println("No hay mensajería disponible");
		}
		
		this.mensajeria.enviar(mensaje);
	}
	 
	/* public boolean esMsjValido(String mensaje) {
		boolean elMsjEsValido = true;
		
		if(mensaje == null) {
			System.err.println("Deb ingresar un mensaje para utilizar el mensajero");
			elMsjEsValido = false;
		}
		
		String auxMsj = mensaje.trim();
		
		if("".equals(auxMsj)) {
			System.err.println("El mensaje ingresado está vacío");
			elMsjEsValido = false;
		}
		
		return elMsjEsValido;
	}
	*/
	
	//agregacion
	public void setMensajeria(IMensaje mensajeria) {
		this.mensajeria = mensajeria;
	}
}
