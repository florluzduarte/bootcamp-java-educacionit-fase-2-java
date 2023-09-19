package ar.com.educacionit.polimorfismo;

public final class Xbox extends Consola {
	
	private boolean tieneConexionAInternet;
	private int memoria;
	private boolean digital;
	private DiscoExterno discoExterno;

	public Xbox(String serie, String color, int anio, boolean tieneConexion, int memoriaRam,
			boolean esDigital) {
		super(serie, "Microsoft", color, "Xbox360", anio);
		this.anioDeFabricacion = anio;
		this.tieneConexionAInternet = tieneConexion;
		this.memoria = memoriaRam;
		this.digital = esDigital;
	}

	public DiscoExterno getDiscoExterno() {
		return discoExterno;
	}

	public void setDiscoExterno(DiscoExterno discoExterno) {
		this.discoExterno = discoExterno;
	}

	public boolean isTieneConexionAInternet() {
		return tieneConexionAInternet;
	}

	public int getMemoria() {
		return memoria;
	}

	public boolean isDigital() {
		return digital;
	}
	
	@Override
	public void play() {
		System.out.println("Jugando con la Xbox360");
	}
}
