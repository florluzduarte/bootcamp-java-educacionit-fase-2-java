package ar.com.educacionit.kpis;

public class Abandonos implements IKpi{

	@Override
	public Resultado calcular(Turno[] turnos) {
		int cantDeAbandonos = 0;
		for(Turno turno : turnos) {
			if(turno.getFechaDeAbandono() != null) {
				cantDeAbandonos++;
			}
		}
		
		Resultado resultado = new Resultado("Cantidad de abandonos:", cantDeAbandonos);
		return resultado;
	}

}
