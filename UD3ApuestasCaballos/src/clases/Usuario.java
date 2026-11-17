package clases;

import java.time.LocalDate;

public class Usuario {

	final private String DNI;
	final private LocalDate fechaNacimiento;
	private String nombre;
	private Double saldo;
	private Integer apuestasGanadas;
	private Integer apuestasPerdidas;
	
	public Usuario(String dni, String name, LocalDate fechaNacimiento, double saldo) {
		this.DNI = dni;
		this.nombre = name;
		this.fechaNacimiento = fechaNacimiento;
		setSaldo(saldo);
		apuestasGanadas = 0;
		apuestasPerdidas = 0;
	}

	public String getName() {
		return nombre;
	}

	public void setName(String name) {
		this.nombre = name;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		if (saldo < 0) {
			throw new IllegalArgumentException();
		}
		this.saldo = saldo;
	}

	public String getDNI() {
		return DNI;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public Integer getApuestasGanadas() {
		return apuestasGanadas;
	}
	
	public void setApuestasGanadas(Integer apuestasGanadas) {
		this.apuestasGanadas = apuestasGanadas; 
	}

	public Integer getApuestasPerdidas() {
		return apuestasPerdidas;
	}
	
	public void setApuestasPerdidas(Integer apuestasPerdidas) {
		this.apuestasPerdidas = apuestasPerdidas;
	}
	
	@Override
	public String toString() {
		return "[ " + nombre + ", " + saldo + " ]";
	}
}
