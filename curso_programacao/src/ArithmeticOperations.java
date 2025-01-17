
public class ArithmeticOperations {

	public static void main(String[] args) {

		// Exemplos de operações aritméticas básicas
		int numero1 = 3;
		int numero2 = 9;
		double numero3 = 2.34;

		// Soma
		double resultadoSoma = numero1 + numero2 + numero3;
		System.out.println("O resultado da soma dos números é: " + resultadoSoma);

		// Subtração
		double resultadoSubtracao = numero1 - numero2 - numero3;
		System.out.println("O resultado da subtração dos números é: " + resultadoSubtracao);

		// Multiplicação
		double resultadoMultiplicacao = numero1 * numero2 * numero3;
		System.out.println("O resultado da multiplicação dos números é: " + resultadoMultiplicacao);

		// Divisão
		double resultadoDivisao = numero1 / numero2 / numero3;
		System.out.println("O resultado da divisão dos números é: " + resultadoDivisao);

		// Resto da divisão
		int resultadoRestoDivisao = numero1 % numero2;
		System.out.println("O resultado do resto da divisão dos números é: " + resultadoRestoDivisao);

		// Ordem de precedência dos operadores
		System.out.println("Ordem de precedência: 1° * / % (Multiplicação, divisão e resto), 2° + - (Adição e subtração)");
	}

}
