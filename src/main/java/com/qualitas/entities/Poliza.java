package com.qualitas.entities;

import java.time.LocalDate;

public class Poliza {
	private int numero;
	private LocalDate inicioVigencia;
	private LocalDate finVigencia;

	public Poliza(int numero, LocalDate inicioVigencia, LocalDate finVigencia) {
		this.numero = numero;
		this.inicioVigencia = inicioVigencia;
		this.finVigencia = finVigencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDate getInicioVigencia() {
		return inicioVigencia;
	}

	public void setInicioVigencia(LocalDate inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}

	public LocalDate getFinVigencia() {
		return finVigencia;
	}

	public void setFinVigencia(LocalDate finVigencia) {
		this.finVigencia = finVigencia;
	}

	public String toString() {
		return "Num=" + getNumero();
	}
}
