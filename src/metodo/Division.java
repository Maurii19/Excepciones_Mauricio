package metodo;

public class Division {

	private int numerador;
	private int denominador;
	private float calculo;
	

	public int getNumerador() {
		return numerador;
	}


	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}


	public int getDenominador() {
		return denominador;
	}


	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}


	public float getCalculo() {
		return calculo;
	}


	public void setCalculo(float calculo) {
		this.calculo = calculo;
	}


	public void realizarDivision(String numerador_str, String denominador_str) throws NumberFormatException, ArithmeticException{
	numerador = Integer.parseInt(numerador_str);
	denominador = Integer.parseInt(denominador_str);

	calculo = numerador / denominador;
}

}