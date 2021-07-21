package Empleados;

public class EmpleadoPasante extends Empleado{
	
	
	private int horasTrabajadas;

	public EmpleadoPasante(int horas) {
		super();
		this.setHorasTrabajadas(horas);
	}
	
	@Override
	protected Double extraPorHoras() {
		// TODO Auto-generated method stub
		return this.getHorasTrabajadas() * 40.0;
	}

	@Override
	protected Double extraPorHijosOMatrimonio() {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	protected Double getSueldoInicial() {
		// TODO Auto-generated method stub
		return 0.0;
	}
	
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

}
