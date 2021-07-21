package CuentaBancaria;

public class CajaDeAhorro extends CuentaBancaria {
	
	private int limite;


	public CajaDeAhorro(String titular, int limite) {
		super(titular);
		// TODO Auto-generated constructor stub
		this.setLimite(limite);
	}

	@Override
	protected boolean puedeExtraer(int monto) {
		// TODO Auto-generated method stub
		return (this.getSaldo()>=monto && this.getLimite()>=monto);
	}


	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}
}
