package questao2;

public class Calculadora {
	double somar, subtrair, multiplicar, dividir;
	double resultado;

	public int somar(double valor1, double valor2) {
		this.resultado = valor1 + valor2;
		return (int) resultado;
	}
	public int subtrair(double valor3, double valor4) {
		this.resultado = valor3 - valor4;
		return (int) resultado;
	}
	public int multiplicar(double valor1, double valor2) {
		this.resultado = valor1 * valor2;
		return (int) resultado;
	}
	public int dividir(double valor1, double valor2) {
		this.resultado = valor1 / valor2;
		return (int) resultado;
	}

}

