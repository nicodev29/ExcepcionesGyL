package EJ3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {


        try{
            System.out.println("Ingrese el primer numero: ");
            int num1 = leer.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            int num2 = leer.nextInt();

            DivisionNumero division = new DivisionNumero();
            DivisionNumero.dividir(num1, num2);

        } catch (InputMismatchException ime) {
            System.out.println("No ingresaste un numero");
        } catch (ArithmeticException ae) {
            System.out.println("No se puede dividir por 0");
        } catch (Exception e) {
            System.out.println("Error por otra cosa");
        }

    }
}
