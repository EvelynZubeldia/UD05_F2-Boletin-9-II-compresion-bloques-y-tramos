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

        //posicion indicada donde se coloca el siguiente numero en aux
        //no se reinicia entre pasadas, asi cada grupo queda detras del anterior
        int posicion = 0; 

        //copiamos los numeros positivos (mayores que 0)
        System.out.print("Numeros positivos: ");
        for(int i = 0; i < array.length; i++) {
            if(array[i] > 0) {
                aux[posicion] = array[i];
                posicion++;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        //copiamos los ceros
        System.out.print("Ceros: ");
        for(int i = 0; i < array.length; i++) {
            if(array[i] == 0) {
                aux[posicion] = array[i];
                posicion++;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        //copiamos los numeros negativos (menores que 0)
        System.out.print("Numeros negativos: ");
        for(int i = 0; i < array.length; i++) {
            if(array[i] < 0) {
                aux[posicion] = array[i];
                posicion++;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        //copiar el resultado de vuelta al array original
        for(int i = 0; i < array.length; i++) {
            array[i] = aux[i];
        }

        //Resultado
        System.out.print("Array organizado: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
