package org.generation.util.banco;

import java.util.Date;

public class CuentaCredito extends Cuenta {
	
	private Date fechaCorte;
	private float tasa;
	private double limite;
	
	public CuentaCredito(double saldo, String numeroCliente, Date fechaApertura, String nombreCliente) {
		super(saldo, numeroCliente, fechaApertura, nombreCliente);
		
	}//constructor
	

	public Date getFechaCorte() {
		return fechaCorte;
	}


	public void setFechaCorte(Date fechaCorte) {
		this.fechaCorte = fechaCorte;
	}


	public float getTasa() {
		return tasa;
	}


	public void setTasa(float tasa) {
		this.tasa = tasa;
	}


	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}


	@Override
	public double retiro(double cantidad) {
		return 0;
	}

	@Override
	public double deposito(double cantidad) {
		return 0;
	}

	@Override
	public double getSaldo() {
		return saldo;
	}
	
	public String toString() {
		return "Cuenta Crédito [" + super.toString() +
				" Tasa=" + getTasa() + "%, Límite="
				+ getLimite() + "]";
	}//toString

}
