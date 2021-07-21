package CuentaBancaria;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {

	private String titular;
	private int saldo;
	private List <String> movimientos;
	
	public CuentaBancaria(String titular) {
		this.titular=titular;
		this.saldo=0;
		this.movimientos= new ArrayList<String>();
	}
	
	public String getTitular() {
		
		
		return this.titular;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public void agregarMovimientos(String movimiento) {
		
		this.movimientos.add(movimiento);
	
	}
	
	public void extraer (int monto) {
		if (this.puedeExtraer(monto)) {
			this.setSaldo(this.getSaldo() -monto);
			this.agregarMovimientos("Extraccion");
		}
	}

	protected abstract boolean puedeExtraer(int monto);
}
