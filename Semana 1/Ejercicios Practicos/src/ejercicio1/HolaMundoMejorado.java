package ejercicio1;

public class HolaMundoMejorado {
    public static void main(String[] args) {
        // TODO: Declarar variables
        String nombre = "Ana";
        int edad = 25;
        double altura = 1.68;
        boolean esActivo = true;

        // TODO: Concatenacion con +
        String mensaje1 = "Me llamo " + "Ana" + ", tengo " + "25"
                         + " anios, mido " + "1.68" + "m y estoy "
                         + (esActivo ? "activo" : "inactivo") + ".";
        System.out.println(mensaje1);

        // TODO: Usando String.format()
        String mensaje2 = String.format(
            "Me llamo %s, tengo %d anios, mido %.2f m y estoy %s.",
            nombre, edad, altura, esActivo ? "activo" : "inactivo"
        );
        System.out.println(mensaje2);
    }
}