package br.com.ita;

public class Principal {

	public static void main(String[] args) {

		Paciente paciente1 = new Paciente(70,1.78);
		Paciente paciente2 = new Paciente(40,1.50);
		Paciente paciente3 = new Paciente(92,1.85);

		System.out.println("O IMC do paciente 1 � "+ String.format("%.2f", paciente1.calcularIMC())+" e seu resultado � "+paciente1.diagnostico());
		
		System.out.println("O IMC do paciente 2 � "+ String.format("%.2f", paciente2.calcularIMC())+" e seu resultado � "+paciente2.diagnostico());
		
		System.out.println("O IMC do paciente 3 � "+ String.format("%.2f", paciente3.calcularIMC())+" e seu resultado � "+paciente3.diagnostico());

	}

}
