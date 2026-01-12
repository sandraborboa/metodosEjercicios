import java.util.Scanner;
import java.util.Random;

public class AdivinarNumero {

    // ---- RETO 3: Crear un programa donde el usuario debe adivinar un número
    // 1. El programa debe declarar un número al azar del 1 al 10 (Class Random)
    // 2. Mientras no se haya adivinado el número el usuario puede seguir ingresando números
    // 3. Avisar al usuario si el número que ingresó es mayor o menor al declarado
    // 4. El programa debe terminar cuando el usuario adivine el número

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public void reto() {
        boolean acertado = false;
        int numUsuario;
        int numGanador;

        numGanador = random.nextInt(1, 11);

        System.out.println("Reto 3: Adivina un número entre 1 y 10.");

        while (!acertado) {
            System.out.print("Ingresa un número: ");
            numUsuario = scanner.nextInt();

            if(numUsuario == numGanador) {
                System.out.println("¡Acertado! " + numUsuario + " es el número correcto. Felicidades.");
                acertado = true;
            } else if (numUsuario > numGanador) {
                System.out.println("Número incorrecto. Tu número ingresado es mayor a la respuesta correcta. Inténtalo de nuevo.");
            } else {
                System.out.println("Número incorrecto. Tu número ingresado es menor a la respuesta correcta. Inténtalo de nuevo.");
            }
        }
    }
}
