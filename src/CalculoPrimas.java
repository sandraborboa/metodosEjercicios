import java.util.Scanner;

public class CalculoPrimas {
    // ---- RETO 4: Sofia está desarrollando un sistema para calcular las primas de seguro mensuales en una compañía de seguros. El cálculo de las primas se basa en la edad y los ingresos mensuales de cada usuario. El sistema debe seguir las siguientes reglas:

    // - Si un usuario tiene más de 70 años, la prima mensual será de $500.
    // - Si un usuario tiene entre 50 y 69 años, la prima mensual será de $400.
    // - Si un usuario tiene entre 30 y 49 años, la prima mensual será de $250.
    // - Si un usuario tiene 29 años o menos, la prima mensual será de $100

    // Además, las primas también se ajustan según los ingresos mensuales
    // - Si los ingresos mensuales de un usuario son iguales o superiores a $300, se aplica un aumento del 10% a la prima calculada.
    // - Si los ingresos mensuales de un usuario son inferiores a $300, se aplica un aumento del 5% a la prima calculada


    public void reto() {
        int edadUsuario;
        int ingresos;
        double primaMensual;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Reto 4: Calculadora de primas de seguro.");

        do {
            System.out.println("Ingresa edad del usuario: ");
            edadUsuario = scanner.nextInt();

            if (edadUsuario <= 0) {
                System.out.println("Edad ingresada no válida, inténtalo de nuevo.");
            }
        } while (edadUsuario <= 0);

        do {
            System.out.println("Ingresa ingresos mensuales del usuario: ");
            ingresos = scanner.nextInt();

            if (ingresos <= 0) {
                System.out.println("Cantidad no válida, inténtalo de nuevo.");
            }
        } while (ingresos < 0);


        if (edadUsuario > 70) {
            primaMensual = 500;
        } else if (edadUsuario >= 50) {
            primaMensual = 400;
        } else if (edadUsuario >= 30) {
            primaMensual = 250;
        } else {
            primaMensual = 100;
        }

        if (ingresos >= 300) {
            primaMensual *= 1.10;
        } else {
            primaMensual *= 1.05;
        }

        System.out.println("La prima mensual es: $" + primaMensual);
    }
}
