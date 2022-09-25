package questao2;

import java.util.Scanner;

public class TestaCalculadora {

	public static void main(String[] args) {
		double valor1;
		double valor2;
		double resultado;

		Calculadora c1 = new Calculadora();
		Scanner mat = new Scanner(System.in);
		System.out.println("Digite primeiro valor -> ");
		valor1 = mat.nextDouble();
		System.out.println("Digite segundo valor -> ");
		valor2 = mat.nextDouble();

		c1.somar(valor1, valor2);
		System.out.println("O valor da soma e: " + c1.resultado);


		c1.subtrair(valor1, valor2);
		System.out.println("O valor da subtracao e: " + c1.resultado);

		c1.multiplicar(valor1, valor2);
		System.out.println("O valor da multiplicacao e: " + c1.resultado);

		c1.dividir(valor1, valor2);
		System.out.println("O valor da divisao e: " + c1.resultado);

	}

}
