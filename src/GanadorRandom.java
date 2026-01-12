import java.util.Scanner;
import java.util.Random;

public class GanadorRandom {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    // ---- RETO 1: Crear un programa que simule un generador de número ganador al azar
    // El usuario debe ingresar el número total de participantes y el programa debe mostar por consola dicho número ganador

    public void reto() {

        System.out.println("Reto 1: Generador de número ganador.");
        System.out.print("Ingresa el numero total de participantes: ");
        int max = scanner.nextInt();
        scanner.close();

        int ganador = random.nextInt(1, max + 1); // El segundo parametro es exclusivo, por eso +1

        System.out.println("El participante ganador es: " + ganador);
    }
}
