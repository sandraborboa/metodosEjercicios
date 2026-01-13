import java.util.Scanner;

public class Fibonacci {
    // ---- RETO 5: Los números de Fibonacci son un problema informático tradicional: "Cada número es la suma de los dos anteriores, empezando por 0 y 1".
    // Implementar la secuencia de Fibonacci en Java.

    int num1 = 0;
    int num2 = 1;
    int suma;
    int repeticion;

    public void reto() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Reto 5: Serie Fibonacci");
        do {
            System.out.print("Ingresa el número de series: ");
            repeticion = scanner.nextInt();

            if (repeticion < 0) {
                System.out.println("Número de series no válido, inténtalo de nuevo.");
            }
        } while (repeticion < 0);


        for (int i = 0; i < repeticion; i++) {
            System.out.println(num1); // imprime el primer número de la serie

            suma = num1 + num2; // calcula el siguiente número y lo guarda en la variable suma
            num1 = num2; // recorre el primer número
            num2 = suma; // recorre el segundo número (usando el valor de suma)
        }

    }
}
