package Empleados;

public class EmpleadoTemporario extends Empleado {

	
	private boolean estaCasadx;
	private int horasTrabajadas;
	private int cantidadDeHijos;
	
	public EmpleadoTemporario(boolean estacasado, int horas, int cantidadHijos) {
		super();
		this.setCantidadDeHijos(cantidadHijos);
		this.setEstaCasadx(estacasado);
		this.setHorasTrabajadas(horas);
		
		
	}


	@Override
	protected Double extraPorHoras() {
		// TODO Auto-generated method stub
		return this.getHorasTrabajadas()*5.0;
	}

	@Override
	protected Double extraPorHijosOMatrimonio() {
		// TODO Auto-generated method stub
		double valor= 0;
		if (this.isEstaCasadx() || this.getCantidadDeHijos()>0) {
			valor+=100;
		}
		return valor;
	}

	@Override
	protected Double getSueldoInicial() {
		// TODO Auto-generated method stub
		return 1000.0;
	}
	
	public boolean isEstaCasadx() {
		return estaCasadx;
	}

	public void setEstaCasadx(boolean estaCasadx) {
		this.estaCasadx = estaCasadx;
	}
	
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public int getCantidadDeHijos() {
		return cantidadDeHijos;
	}

	public void setCantidadDeHijos(int cantidadDeHijos) {
		this.cantidadDeHijos = cantidadDeHijos;
	}






	
}
