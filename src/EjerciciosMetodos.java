import java.util.Scanner;


public class EjerciciosMetodos {

    public static void main(String[] args) {
        System.out.println("Bienvenidx, puedes elegir una de las siguientes opciones: ");
        System.out.println("Reto 1. Generador de participante ganador 🥇");
        System.out.println("Reto 2. Verificador de palíndromo 🪞");
        System.out.println("Reto 3. Adivina el número 🔢");
        System.out.println("Reto 4. Calculadora de primas de seguro 🧮");
        System.out.println("Reto 5. Impresora de serie Fibonacci 🌿");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de reto que deseas ejecutar: ");
        int eleccion = scanner.nextInt();

        switch(eleccion){
            case 1:
                GanadorRandom ganadorRandom = new GanadorRandom();
                ganadorRandom.reto();
                break;
            case 2:
                Palindromo palindromo = new Palindromo();
                palindromo.reto();
                break;
            case 3:
                AdivinarNumero adivinarNumero = new AdivinarNumero();
                adivinarNumero.reto();
                break;
            case 4:
                CalculoPrimas calculoPrimas = new CalculoPrimas();
                calculoPrimas.reto();
                break;
            case 5:
                Fibonacci fibonacci = new Fibonacci();
                fibonacci.reto();
                break;
            default:
                System.out.printf("%d no es un número de reto válido 🤔", eleccion);
        }
        scanner.close();


        // ---- RETO 1
        // GanadorRandom ganadorRandom = new GanadorRandom();
        // ganadorRandom.reto();

        // ---- RETO 2
        // Palindromo palindromo = new Palindromo();
        // palindromo.reto();

        // ---- RETO 3
        // AdivinarNumero adivinarNumero = new AdivinarNumero();
        // adivinarNumero.reto();

        // ---- RETO 4
        // CalculoPrimas calculoPrimas = new CalculoPrimas();
        // calculoPrimas.reto();

        // ---- RETO 5
        // Fibonacci fibonacci = new Fibonacci();
        // fibonacci.reto();
    }
}
