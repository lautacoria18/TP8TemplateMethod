package Empleados;

public class EmpleadoDePlanta extends Empleado{
	
	private int cantidadDeHijos;
	
	public EmpleadoDePlanta(int cantidadHijos) {
		super();
		this.setCantidadDeHijos(cantidadHijos);
	}

	@Override
	protected Double extraPorHoras() {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	protected Double extraPorHijosOMatrimonio() {
		// TODO Auto-generated method stub
		return this.getCantidadDeHijos()*150.0;
	}

	@Override
	protected Double getSueldoInicial() {
		// TODO Auto-generated method stub
		return 3000.0;
	}

	public int getCantidadDeHijos() {
		return cantidadDeHijos;
	}

	public void setCantidadDeHijos(int cantidadDeHijos) {
		this.cantidadDeHijos = cantidadDeHijos;
	}

}
