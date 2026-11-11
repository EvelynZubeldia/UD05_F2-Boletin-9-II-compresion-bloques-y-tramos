import java.util.Scanner;

public class Ej10Tramo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaramos el primer array de 12 numeros enteros
        int[] array = new int[12];

        //Solicitar al usuario que introduzca 12 numeros enteros
        for(int i = 0; i < array.length; i++) {
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        
        //Mostramos el array para comprobar lo que se ha guardado
        System.out.println("Array: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //vamos a suponer que el mejortramo es el primero
        int mejorSuma = array[0] + array[1] + array[2];
        int mejorPosicion = 0; //posicion donde empieza ese tramo

        //ahora recorremos los tramos de tres elementos. paramos en length - 2 porque
        // en cada vuelta miramos array[i + 1] y array[i + 2]
        for(int i = 1; i < array.length - 2; i++) {

            //calculamos la suma del tramo que empieza en posicion i
            int suma = array[i] + array[i + 1] + array[i + 2];

            //si supera a la mejor suma, actualizamos el record
            //usamos > y no >= para que si hay empate se quede el primer tramo
            if (suma > mejorSuma) {
                mejorSuma = suma;
                mejorPosicion = i;
            }
        }

        //Resultados
        System.out.println("Los tres numeros son: " + array[mejorPosicion] + ", " + array[mejorPosicion + 1] + " y " + array[mejorPosicion + 2]);
        System.out.println("Posiciones: " + mejorPosicion + ", " + (mejorPosicion + 1) + " y " + (mejorPosicion + 2));
        System.out.println("Suma: " + mejorSuma);

        sc.close();
    }
}
