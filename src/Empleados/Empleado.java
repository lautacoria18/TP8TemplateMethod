package Empleados;

public abstract class Empleado {
	



		public Double getSueldo() {
			
			Double sueldo= (this.getSueldoInicial() + this.extraPorHijosOMatrimonio() + this.extraPorHoras());
			
			Double descuentoDeSueldo= sueldo * 0.13;
			
			return (sueldo - descuentoDeSueldo);
		}

		
		
		protected abstract Double extraPorHoras();

		protected abstract Double extraPorHijosOMatrimonio();

		protected abstract Double getSueldoInicial();
		
		


		

}
