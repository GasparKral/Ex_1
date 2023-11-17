import java.util.Scanner;

public class Texto {

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        System.out.println("Introduce un texto");
        String texto = imput.nextLine();
        imput.close();
        System.out.println("El texto introducido es: " + texto);

    }
}