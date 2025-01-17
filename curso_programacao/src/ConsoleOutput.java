import java.util.Locale;

public class ConsoleOutput {

    public static void main(String[] args) {
        // Exemplo de saída sem e com quebra de linha
        System.out.print("Bom dia!"); // Sem quebra de linha
        System.out.println("Bom dia!"); // Com quebra de linha

        // Exibição de variáveis
        int years = 19;
        System.out.print(years);

        // Exibição de ponto flutuante
        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n", x); // Duas casas decimais
        System.out.printf("%.4f%n", x); // Quatro casas decimais

        // Configuração de localidade para usar ponto como separador decimal
        Locale.setDefault(Locale.US);

        // Concatenação de elementos
        System.out.println("Marcel tem " + years + " anos de idade");
        System.out.printf("RESULTADO = %.2f metros%n", x);

        // Exemplo de múltiplos formatos
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

    // %f = ponto flutuante
    // %d = inteiro
    // %s = texto
    // %n = quebra de linha
    }
}	