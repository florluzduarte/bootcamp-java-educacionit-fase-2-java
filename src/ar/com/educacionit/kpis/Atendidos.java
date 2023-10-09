package ar.com.educacionit.kpis;

public class Atendidos implements IKpi {

	@Override
	public Resultado calcular(Turno[] turnos) {
		int cantDeAtendidos = 0;
		for(Turno turno : turnos) {
			if(turno.getFechaDeAtencion() != null) {
				cantDeAtendidos++;
			}
		}
		
		Resultado resultado = new Resultado("Cantidad de atendidos:", cantDeAtendidos);
		return resultado;
	}
}
