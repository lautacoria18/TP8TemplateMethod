package CuentaBancaria;

public class CuentaCorriente extends CuentaBancaria {
	
	private int descubierto;

	public CuentaCorriente(String titular, int descubierto) {
		super(titular);
		this.setDescubierto(descubierto);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean puedeExtraer(int monto) {
		// TODO Auto-generated method stub
		return (this.getSaldo()+this.getDescubierto() >=monto);
	}
	
	public int getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(int descubierto) {
		this.descubierto = descubierto;
	}

}
