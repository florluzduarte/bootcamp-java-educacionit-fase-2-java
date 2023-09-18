package ar.com.educacionit.ecommerce;

public class Resultado {
	private String titulo;
	private String imagen;
	private float precio;
	private String autor;

	public Resultado(String titulo, String imagen, float precio, String autor) {
		this.titulo = titulo;
		this.imagen = imagen;
		this.precio = precio;
		this.autor = autor;
	}

	public String getTitulo() {
		return this.titulo;
	};

	public String getImagen() {
		return this.imagen;
	}

	public float getPrecio() {
		return this.precio;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setPrecio(float precio) {
		if (precio < 0) {
			this.precio = 0;
		} else {
			this.precio = precio;
		}
	}

	public void setImagen(String imagen) {
		if (imagen == null) {
			this.imagen = "imagen generica";
		} else {
			this.imagen = imagen;
		}
	}

	@Override
	public String toString() {
		return "Resultado [titulo=" + titulo + ", imagen=" + imagen + ", precio=" + precio + ", autor=" + autor + "]";
	}
	
}
