import java.util.Scanner;

public class Ej6Comprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaramos el primer array de 15 números enteros
        int[] array1 = new int[15];

        //Solicitar al usuario que introduzca 15 números enteros
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

        //el contador indica cuantas veces llevamos el numero actual
        //empieza en 1 porque el primer nmero ya cuneta una vez
        int contador = 1;

        System.out.println("Array comprimido: ");

        //recorremos el array desde la posicion 1 comparando con el anterior
        for(int i = 1; i < array1.length; i++) {
            //si es igual a la anterior, la racha continua
            if(array1[i] == array1[i - 1]) {
                contador++;
            } 
            //si es distinto, mostramos el numero anterior y cuantas veces ha aparecido
            else {
                System.out.print(array1[i - 1] + " aparece " + contador + " veces. ");
                contador = 1;
            }
        }

        //La ultima racha no se ha mostrado todavía, así que la mostramos ahora
        System.out.print(array1[array1.length - 1] + " aparece " + contador + " veces. ");
        System.out.println();

        sc.close();

    }
}



