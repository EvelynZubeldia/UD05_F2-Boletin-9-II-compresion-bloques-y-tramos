import java.util.Scanner;

public class Ej7Bloques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaramos el primer array de 12 numeros enteros
        int[] array1 = new int[12];

        //Solicitar al usuario que introduzca 12 numeros enteros
        for(int i = 0; i < array1.length; i++) {
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            array1[i] = sc.nextInt();
        }

        //Mostramos el array para comprobar lo que se ha guardado
        System.out.print("Array: ");
        for(int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        //Array auxliar
        int[] aux = new int[12];

        //Como cada bloque tiene 4 numeros, el bucle da cuatro vueltas
        //i es la posicion dentro del elemento dentro de su bloque
        for (int i = 0; i < 4; i++) {
            aux[i] = array1[i + 8]; //el bloque 3 pasa al principio
            aux[i + 4] = array1[i]; //el bloque 1 pasa al centro
            aux[i + 8] = array1[i + 4]; //el bloque 2 pasa al final
        }

        //Copiamos el resultado de vuelta al array original
        for(int i = 0; i < array1.length; i++) {
            array1[i] = aux[i];
        }

        //Resultados 
        System.out.print("Array final: ");
        for(int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
