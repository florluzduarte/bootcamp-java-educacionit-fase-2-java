package ar.com.educacionit.kpis;

public class PorcentajeAtendidos implements IKpi {

	@Override
	public Resultado calcular(Turno[] turnos) {
		CantidadTotal totalTurnos = new CantidadTotal();
		Resultado resTotal = totalTurnos.calcular(turnos);
		float cantTotalTurnos = resTotal.getValor(); 
		
		Atendidos atendidos = new Atendidos();
		Resultado res = atendidos.calcular(turnos);
		float cantDeAtendidos = res.getValor();
		
		float porcentaje = (cantDeAtendidos * 100) / cantTotalTurnos;
		
		Resultado resultado = new Resultado("Porcentaje de atendidos", porcentaje);
		return resultado;
	}
}