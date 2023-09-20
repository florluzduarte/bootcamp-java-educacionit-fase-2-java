package ar.com.educacionit.ecommerce;

import java.util.Arrays;

public class Musica extends Resultado {

	private String selloDiscografico;
	private String codigo;
	private String formato;
	private String fechaDePublicacion;
	private String[] canciones;

	public Musica(String titulo, String imagen, float precio, String autor, String selloDiscografico, String codigo,
			String formato, String fecha) {
		super(titulo, imagen, precio, autor);
		this.selloDiscografico = selloDiscografico;
		this.codigo = codigo;
		this.formato = formato;
		this.fechaDePublicacion = fecha;
	}

	public String[] getCanciones() {
		return canciones;
	}

	public void setCanciones(String[] canciones) {
		this.canciones = canciones;
	}

	public String getSelloDiscografico() {
		return selloDiscografico;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getFormato() {
		return formato;
	}

	public String getFechaDePublicacion() {
		return fechaDePublicacion;
	}

	@Override
	public String toString() {
		return super.toString() + "Musica [selloDiscografico=" + selloDiscografico + ", codigo=" + codigo + ", formato=" + formato
				+ ", fechaDePublicacion=" + fechaDePublicacion + ", canciones=" + Arrays.toString(canciones) + "]";
	}

}
