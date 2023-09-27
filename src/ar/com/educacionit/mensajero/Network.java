package ar.com.educacionit.mensajero;

public class Network extends Mensaje {

	private String destino;
	private String origen;
	
	public Network(String contenido, String destino, String origen) {
		super(contenido);
		this.setDestino(destino);
		this.setOrigen(origen);
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	
}
