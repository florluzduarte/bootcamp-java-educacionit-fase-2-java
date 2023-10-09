package ar.com.educacionit.kpis;

public class CantidadTotal implements IKpi {

	@Override
	public Resultado calcular(Turno[] turnos) {
		int valorCalculado = turnos.length;
		Resultado resultado = new Resultado("Cantidad total de turnos:", valorCalculado);
		return resultado;
	}
}
