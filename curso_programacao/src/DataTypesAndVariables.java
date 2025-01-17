public class DataTypesAndVariables {

    public static void main(String[] args) {
        // Tipos primitivos
        byte exemploByte = 127;
        short exemploShort = 32767;
        int exemploInt = 2147483647;
        long exemploLong = 9223372036854775807L;

        float exemploFloat = 3.14f;
        double exemploDouble = 3.141592653589793;

        boolean exemploBoolean = true;
        char exemploChar = 'A';

        String exemploString = "Exemplo de String";

        // Exibição de valores
        System.out.println("Tipos Inteiros:");
        System.out.println("byte: " + exemploByte);
        System.out.println("short: " + exemploShort);
        System.out.println("int: " + exemploInt);
        System.out.println("long: " + exemploLong);

        System.out.println("\nNúmeros com ponto flutuante:");
        System.out.println("float: " + exemploFloat);
        System.out.println("double: " + exemploDouble);

        System.out.println("\nValor Verdade:");
        System.out.println("boolean: " + exemploBoolean);

        System.out.println("\nCaractere Unicode:");
        System.out.println("char: " + exemploChar);

        System.out.println("\nCadeia de caracteres:");
        System.out.println("String: " + exemploString);

        // Definição de variável
        String nome = "Marcel";
        int idade = 19;
        double altura = 1.82;
        char sexo = 'M';
        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos, " + altura + "m de altura e sou do sexo " + sexo);

        /* Regras para nomeação de variáveis:
           - Não pode começar com dígito.
           - Não pode conter espaços.
           - Evitar acentos e caracteres especiais.
           - Siga o padrão camelCase. */
    }
}