package ar.com.educacionit.ecommerce;

public class Pelicula extends Resultado {

	private String sinopsis;
	private String productora;
	private String codigo;
	private String tipoDeAudiencia;
	private String fechaDePublicacion;

	public Pelicula(String titulo, String imagen, float precio, String autor, String productora, String codigo,
			String audiencia, String fecha) {
		super(titulo, imagen, precio, autor);
		this.productora = productora;
		this.codigo = codigo;
		this.tipoDeAudiencia = audiencia;
		this.fechaDePublicacion = fecha;
	}

	public String getSinopsis() {
		return this.sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public String getProductora() {
		return productora;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getTipoDeAudiencia() {
		return tipoDeAudiencia;
	}
	
	public String getFechaDePublicacion() {
		return fechaDePublicacion;
	}

	@Override
	public String toString() {
		return "Pelicula [sinopsis=" + sinopsis + ", productora=" + productora + ", codigo=" + codigo
				+ ", tipoDeAudiencia=" + tipoDeAudiencia + ", fechaDePublicacion=" + fechaDePublicacion + "]";
	}
	
}
