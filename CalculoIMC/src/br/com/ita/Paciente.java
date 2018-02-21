package br.com.ita;

public class Paciente {
	private double peso;
	private double altura;
	double imc;
	String resultadoIMC;
	
	public Paciente(double peso, double altura){
		
		this.peso = peso;
		this.altura = altura;
		
	}

	public double getPeso() {
		return peso;
		
	}

	public void setPeso(double peso) {
		this.peso = peso;
		
	}

	public double getAltura() {
		return altura;
		
	}

	public void setAltura(double altura) {
		this.altura = altura;
		
	}
	
	public double calcularIMC(){
		
		return this.peso/(this.altura * this.altura);
		
	}
	
	public String diagnostico(){
		
		double imc = calcularIMC();
		
		if(imc < 16 ){
			 resultadoIMC = "Baixo peso muito grave";
			 
		}else if(imc >=16 && imc <=16.99){
			resultadoIMC = "Baixo peso grave";
			
		}else if (imc >=17 && imc <=18.49 ){
			resultadoIMC = "baixo peso";
			
		}else if (imc >=18.50 && imc <=24.99 ){
			resultadoIMC = "Peso normal";
			
		}else if (imc >=25 && imc <=29.99 ){
			resultadoIMC = "Sobrepeso";
			
		}else if (imc >=30 && imc <=34.99 ){
			resultadoIMC = "Obesidade grau I";
			
		}else if (imc >= 35 && imc <=39.99 ){
			resultadoIMC = "Obesidade grau II";
			
		}else {
			resultadoIMC = "Obesidade grau III (obesidade mórbida) ";
			
		}
		
		return resultadoIMC;
	}
}
