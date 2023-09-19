package ar.com.educacionit.polimorfismo;

public class Play extends Consola {

	private boolean tieneConexionAInternet;
	private int memoria;
	private boolean digital;
	private int version;
	private DiscoExterno discoExterno;

	public Play(String serie, String color, int version, int anio, boolean tieneConexion, int memoriaRam,
			boolean esDigital) {
		super(serie, "Sony", color, "Play" + version, anio);
		this.version = version;
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

	public int getVersion() {
		return version;
	}
	
	@Override
	public void play() {
		System.out.println("Jugando con la Play " + version);
	}
}
