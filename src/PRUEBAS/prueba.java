package PRUEBAS;

import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {


        try
        {
            int x = 10;
            System.out.println("ingrese el valor de y:");
            int y = new Scanner(System.in).nextInt();

            int z = x / y;

            System.out.println("el valor de z es: " + z);
        }
        catch (Exception e)
        {
            System.out.println("error: " + e.getCause());
            e.printStackTrace();
        }

        finally
        {
            System.out.println("Gracias por usar el programa");
        }

    }
}
