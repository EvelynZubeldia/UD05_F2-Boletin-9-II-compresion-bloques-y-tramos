import java.util.Scanner;

public class Ej9Reorganiza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaramos el primer array de 14 numeros enteros
        int[] array = new int[14];

        //Solicitar al usuario que introduzca 15 numeros enteros del 1 al 50
        for(int i = 0; i < array.length; i++) {
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        //Mostramos el array para comprobar lo que se ha guardado
        System.out.print("Array: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //Array para el resultado
        int[] aux = new int[14];

        
    }
}
