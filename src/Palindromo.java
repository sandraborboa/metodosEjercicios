import java.util.Scanner;
import java.util.Random;

public class Palindromo {

    // ---- RETO 2: Crear un programa que solicite al usuario un texto y determine si dicho texto es un palíndromo. Debe mostrarle al usuario la salida "es un palíndromo o "No es un palíndromo"

    Scanner scanner = new Scanner(System.in);

    public void reto() {
        System.out.println("Reto 2: Verificador de palíndromos.");
        System.out.print("Ingresa tu palabra o frase: ");
        String texto = scanner.nextLine();
        scanner.close();

        String textoLimpio = texto.toLowerCase().replace(" ", ""); // Elimina espacios y convierte todo el string a minúscula para la comparación

        String textoInvertido = new StringBuilder(textoLimpio).reverse().toString(); // Se invierte la palabra usando la clase StringBuilder con su metodo reverse y lo convierte de nuevo a string

        if(textoLimpio.equals(textoInvertido)) {
            System.out.println("Tu palabra es un palíndromo.");
        } else {
            System.out.println("Tu palabra no es un palíndromo.");
        }
    }
}
