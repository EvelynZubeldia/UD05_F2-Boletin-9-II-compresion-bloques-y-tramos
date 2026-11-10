import java.util.Scanner;

public class Ej8Pareja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaramos el primer array de 15 numeros enteros
        int[] array = new int[15];

        //Solicitar al usuario que introduzca 15 numeros enteros del 1 al 50
        for(int i = 0; i < array.length; i++) {
            System.out.print("Introduce el numero " + (i + 1) + "(del 1 al 50): ");
            array[i] = sc.nextInt();
        }

        //Mostramos el array para comprobar lo que se ha guardado
        System.out.print("Array: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int mejorSuma = array[0] + array[1]; //la suma mas grande encontrada
        int mejorPosicion = 0; //posicion del primer numero de esa pareja

        //Recorremos las parejas consecutivas
        //Paramos en length - 1 porque en cada vuelta miramos también array[i + 1]
        for (int i = 1; i < array.length - 1; i++) {
            //calculamos la suma de de la pareja formada por la posicion i y la i + 1
            int suma = array[i] + array[i + 1];

            //si supera a la mejor suma, actualizamos el record
            //usamos > (y no >=) para que, si hay empate, se quede la primera pareja
            if(suma > mejorSuma) {
                mejorSuma = suma;
                mejorPosicion = i;
            }
        }

        //resultado
        System.out.println("La pareja con mayor suma es: " + array[mejorPosicion] + " y " + array[mejorPosicion + 1]);
        System.out.println("Posiciones: " + mejorPosicion + " y " + (mejorPosicion + 1));
        System.out.println("Suma: " + mejorSuma);

        sc.close();
    }
}
