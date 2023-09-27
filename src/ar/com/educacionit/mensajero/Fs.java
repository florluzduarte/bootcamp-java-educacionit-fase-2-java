package ar.com.educacionit.mensajero;

public class Fs extends Storage {

	private String path;
	
	public Fs(String contenido, String path) {
		super(contenido);
		this.path = path;
	}
	
	public String getPath() {
		return this.path;
	}

}
