package ejercicio4;

public class ManipuladorStrings {

    public static String invertir(String s) {
    	StringBuilder string = new StringBuilder(s);
    	
        // TODO: usar StringBuilder.reverse()
        return string.reverse().toString();
    }

    public static boolean esPalindromo(String s) {
        // TODO: limpiar (toLowerCase, replaceAll espacios)
        String cleanString = s.toLowerCase().replaceAll("\\s", "");
        
        String reversed = new StringBuilder(cleanString).reverse().toString();
    	
        // TODO: comparar con su version invertida    	
        return (cleanString.equals(reversed));
    }

    public static int contarVocales(String s) {
        int count = 0;
        String vocales = "aeiouAEIOU";
        // TODO: recorrer cada caracter, verificar si es vocal
        for (char vocal : vocales.toCharArray()) {
        	for (char letra : s.toCharArray()) {
        		if (letra==vocal) count++;
        	}
        }
        return count;
    }

    public static String construirPiramide(int niveles) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= niveles; i++) {
            // TODO: agregar espacios (niveles - i)
        	sb.append((" ").repeat(niveles-i));
            // TODO: agregar asteriscos (2*i - 1)
        	sb.append(("*").repeat(2*i-1));
            // TODO: agregar salto de linea
        	sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Invertir 'Hola Mundo': "
                         + invertir("Hola Mundo"));
        System.out.println("'Anita lava la tina' es palindromo: "
                         + esPalindromo("Anita lava la tina"));
        System.out.println("Vocales en 'Murcielago': "
                         + contarVocales("Murcielago"));
        System.out.println("Piramide de 5 niveles:");
        System.out.println(construirPiramide(5));
    }
}