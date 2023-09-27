package ar.com.educacionit.mensajero;

public abstract class Mensaje {
 // Esta clase no se puede instanciar pero sirve para hacer herencia
	protected String contenido;
	
	public Mensaje(String contenido) {
		this.setContenido(contenido);
	}
	
	public String getContenido() {
		return this.contenido;
	}
	
	public void setContenido(String contenido) {
		if(esContenidoValido(contenido) == true) {
			this.contenido = contenido;
		}
	}
	
	public boolean esContenidoValido(String contenido) {
		boolean validezDelContenido = true;
		
		if(contenido == null) {
			System.err.println("El contenido de un mensaje no puede ser nulo");
			validezDelContenido = false;
		}
		
		String contenidoAux = contenido.trim();
		
		if("".equals(contenidoAux)) {
			System.err.println("El contenido de un mensaje no puede estar vacío");
			validezDelContenido = false;
		}
		
		return validezDelContenido;
	}

	@Override
	public String toString() {
		return "Mensaje [contenido = " + contenido + "]";
	}
	
	
}
