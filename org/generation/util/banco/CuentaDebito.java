package org.generation.util.banco;

import java.util.Date;

public class CuentaDebito extends Cuenta{
	private double montoMinimo;
	

public CuentaDebito(double saldo, String numeroCliente, Date fechaApertura, String nombreCliente) {
		super(saldo, numeroCliente, fechaApertura, nombreCliente);
		
	}//constructor


public double getMontoMinimo() {
	return montoMinimo;
}// getMontoMinimo


public void setMontoMinimo(double montoMinimo) {
	this.montoMinimo = montoMinimo;
}// setMontoMinimo


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
	return "Cuenta Débito [" + super.toString() + 
			", Monto mínimo=" + montoMinimo + "]";
}//toString

}//class
