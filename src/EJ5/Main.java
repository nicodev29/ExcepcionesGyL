package EJ5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner( System.in );

        System.out.println("Adivinando el numero: ");

        int numeroAleatorio = (int) (Math.random() * 500 + 1);
        int intentos = 0;
        int numeroUsuario = 0;
        System.out.println("El numero es: " + numeroAleatorio);

        while (true) {
            
            try {
                System.out.println("Ingrese un numero entre 1 y 500: ");
                numeroUsuario = leer.nextInt();
                if (numeroUsuario == numeroAleatorio){
                    System.out.println("Adivino el numero en " + intentos + " intentos");
                    System.out.println("FELICITACIONES");
                    break;
                } else if (numeroUsuario > numeroAleatorio) {
                    System.out.println("El numero ingresado es mayor al numero a adivinar");
                } else {
                    System.out.println("El numero ingresado es menor al numero a adivinar");
                }
            } catch (Exception e) {
                System.out.println("No ingreso un numero");
                break;
            }
            intentos++;

        }
    }
}
