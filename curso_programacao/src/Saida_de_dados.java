import java.util.Locale;

public class Saida_de_dados {

	public static void main(String[] args) {

	// Sem quebra de linha ao final
		System.out.print("Bom dia!");
	
	// Com quebra de linha ao final:
		System.out.println("Bom dia!");	
		
	// Para imprimir uma variável
		
	int years = 19;
	
	System.out.print(years);
	
	// Para escrever o conteúdo de uma variável com ponto flutuante
	double x = 10.35784;
	System.out.println(x);
	System.out.printf("%.2f%n", x);
	System.out.printf("%.4f%n", x);
	// %n = quebra de linha (independente de plataforma) 
	
	// Localidade do sistema
	//ATENÇÃO:
	//Para considerar o separador de decimais como ponto, ANTES da declaração do Scanner, faça:
	Locale.setDefault(Locale.US);
	
	}
}