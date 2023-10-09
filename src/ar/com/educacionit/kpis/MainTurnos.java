package ar.com.educacionit.kpis;

public class MainTurnos {

	public static void main(String[] args) {
		Turno[] turnos = GeneradorTurnos.generarTurnos();
		IKpi[] kpis = new IKpi[] { new CantidadTotal(), new Atendidos(), new PorcentajeAtendidos(), new Abandonos() };

		for (IKpi kpi : kpis) {
			Resultado res = kpi.calcular(turnos);
			System.out.println(res.getTexto() + " " + res.getValor());
		}
	}
}
