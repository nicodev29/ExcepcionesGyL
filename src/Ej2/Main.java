package Ej2;

public class Main {
    public static void main(String[] args) {

        PruebaEJ2 prueba2 = new PruebaEJ2();

        try {
            PruebaEJ2.prueba2.array[10] = 15;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice fuera de rango");
        } catch (Exception e) {
            System.out.println("Deberia marcar el error de arriba, no este");
        }
    }
}
