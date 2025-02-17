import java.util.Scanner;
public class Excepcion {
    public static void verificarNumero(int numero) throws Exception {
        if (numero % 2 != 0) { 
            throw new Exception("El número es impar.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = input.nextInt();

        try {
            verificarNumero(numero); 
            System.out.println("El número es par.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}