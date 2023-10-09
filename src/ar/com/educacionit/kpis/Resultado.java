package ar.com.educacionit.kpis;

public class Resultado {
	private String texto;
	private float valor;
	
	public Resultado(String texto, float valor) {
		this.setTexto(texto);
		this.setValor(valor);
	}
	
	public void setTexto(String texto) {
		if(texto == null || "".equals(texto.trim())) {
			this.texto = "N/A";
		} else {
			this.texto = texto.trim();
		}
	}
	
	public void setValor(float valor) {
		if(valor < 0) {
			this.valor = 0;
		} else {
			this.valor = valor;
		}
	}

	public String getTexto() {
		return this.texto;
	}

	public float getValor() {
		return this.valor;
	}

	@Override
	public String toString() {
		return "Resultado [texto=" + texto + ", valor=" + valor + "]";
	}
	
}
