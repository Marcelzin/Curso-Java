public class Tipos_primitivos {

    public static void main(String[] args) {
        // Tipos primitivos em Java
        
        // Números inteiros
        byte exemploByte = 127; // Valor máximo para byte
        short exemploShort = 32767; // Valor máximo para short
        int exemploInt = 2147483647; // Valor máximo para int
        long exemploLong = 9223372036854775807L; // Valor máximo para long (sufixo 'L' para long)

        // Números com ponto flutuante
        float exemploFloat = 3.14f; // Sufixo 'f' para float
        double exemploDouble = 3.141592653589793; // Double tem maior precisão

        // Valor verdade
        boolean exemploBoolean = true; // true ou false

        // Um caractere Unicode
        char exemploChar = 'A'; // Apenas um caractere, entre aspas simples

        // Tipo String (cadeia de caracteres)
        String exemploString = "Exemplo de String";

        // Exibindo os valores
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

    }
}
