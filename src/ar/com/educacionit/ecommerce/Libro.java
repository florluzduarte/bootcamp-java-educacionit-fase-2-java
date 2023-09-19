package ar.com.educacionit.ecommerce;

public class Libro extends Resultado {

	private String editorial;
	private String isbn;
	private int numeroDePaginas;
	private String idioma;
	private String fechaDePublicacion;
	private String sinopsis;

	public Libro(String titulo, String imagen, float precio, String autor, String editorial, String isbn, int paginas,
			String idioma, String fecha) {
		super(titulo, imagen, precio, autor);
		this.editorial = editorial;
		this.isbn = isbn;
		this.numeroDePaginas = paginas;
		this.idioma = idioma;
		this.fechaDePublicacion = fecha;
	}

	public String getEditorial() {
		return this.editorial;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public int getNumeroDePaginas() {
		return this.numeroDePaginas;
	}

	public String getIdioma() {
		return this.idioma;
	}

	public String getFechaDePublicacion() {
		return fechaDePublicacion;
	}
	
	public String getSinopsis() {
		return this.sinopsis;
	}
	
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	@Override
	public String toString() {
		return "Libro [editorial=" + editorial + ", isbn=" + isbn + ", numeroDePaginas=" + numeroDePaginas + ", idioma="
				+ idioma + ", fechaDePublicacion=" + fechaDePublicacion + ", sinopsis=" + sinopsis + "]";
	}

}
