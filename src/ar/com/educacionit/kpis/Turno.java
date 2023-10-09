package ar.com.educacionit.kpis;

import java.time.LocalDateTime;

public class Turno {
	private LocalDateTime horario;
	private String dni;
	private String tipoDeTramite;
	private int sucursal;
	private LocalDateTime fechaDeCreacion;
	private LocalDateTime fechaDeAtencion;
	private LocalDateTime fechaFinDeAtencion;
	private LocalDateTime fechaDeAbandono;
	private String asesor;
	
	public Turno(String dni, String tipoDeTramite, LocalDateTime fechaDeCreacion, int sucursal) {
		this.dni = dni;
		this.tipoDeTramite = tipoDeTramite;
		this.fechaDeCreacion = fechaDeCreacion;
		this.sucursal = sucursal;
	}

	public LocalDateTime getHorario() {
		return horario;
	}

	public void setHorario(LocalDateTime horario) {
		this.horario = horario;
	}

	public LocalDateTime getFechaDeAtencion() {
		return fechaDeAtencion;
	}

	public void setFechaDeAtencion(LocalDateTime fechaDeAtencion) {
		this.fechaDeAtencion = fechaDeAtencion;
	}

	public LocalDateTime getFechaFinDeAtencion() {
		return fechaFinDeAtencion;
	}

	public void setFechaFinDeAtencion(LocalDateTime fechaFinDeAtencion) {
		this.fechaFinDeAtencion = fechaFinDeAtencion;
	}

	public LocalDateTime getFechaDeAbandono() {
		return fechaDeAbandono;
	}

	public void setFechaDeAbandono(LocalDateTime fechaDeAbandono) {
		this.fechaDeAbandono = fechaDeAbandono;
	}

	public int getSucursal() {
		return sucursal;
	}

	public String getAsesor() {
		return asesor;
	}

	public void setAsesor(String asesor) {
		this.asesor = asesor;
	}

	public String getDni() {
		return dni;
	}

	public String getTipoDeTramite() {
		return tipoDeTramite;
	}

	public LocalDateTime getFechaDeCreacion() {
		return fechaDeCreacion;
	}
}
