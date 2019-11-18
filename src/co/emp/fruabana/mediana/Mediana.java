package co.emp.fruabana.mediana;

// Realizamos import de la clase Scanner la cual nos permitira ingresar parametros de entrada
import java.util.InputMismatchException;
import java.util.Scanner;

public class Mediana {

    public void calcularMediana() {
        // incializacion de la clase Scanner
        Scanner sc = new Scanner(System.in);
       // Inicializamos la  excepcion
        try {
            int op = 1;
            System.out.println("Desea iniciar el programa:"
                    + "\n" + "1.Si"
                    + "\n" + "2.No");
            int peticion = sc.nextInt();

            while (op == peticion) {

                // Definicion de la variable que medira el tamaño del arreglo
                int tam;
                System.out.println("\n" + "Ingrese el numero de elementos de la lista: ");
                //Introduccion por consola de un numero entero que definira el tamaño del arreglo
                tam = sc.nextInt();

                //Creación del arreglo
                int arr[] = new int[tam];
                System.out.println("ingrese los: " + tam + " valores enteros: ");
                // Se crea un primer bucle for el cual inrementara de uno en uno las casillas del arreglo
                for (int i = 0; i < tam; i++) {
                    //se digitaran los nuemeros enteros que iran dentro del arreglo
                    arr[i] = sc.nextInt();
                }
                int aux = 0;
                //Se crea un segundo bucle el cual le dara orden de menor a mayor a los datos ingresados
                //Este solo incrementara luego de que el bucle interno haya terminado
                for (int j = 0; j < tam; j++) {
                    //Se crea un tercer bucle dentro del segundo que ordenara de menor a mayor los numeros 
                    //comparando la primera casilla con la segunda, la segnda con la tercera y asi sucesivamnete.
                    for (int i = 0; i < tam - 1; i++) {
                        //Se genera la condicion para que se genere el bucle for
                        if (arr[i] > arr[i + 1]) {
                            aux = arr[i];
                            arr[i] = arr[i + 1];
                            arr[i + 1] = aux;
                        }
                    }
                }
                // Se inicializa una variable de tipo entero
                int k = 0;
                System.out.println("El arreglo ordenado es: ");
                //se genera un bucle while el cual tiene como funcion recorrer el arreglo para luego imprimirlo ordenadamente
                while (k < tam) {

                    System.out.print(arr[k] + "\t");
                    k++;
                }
                System.out.println("\n" + "Mediana");
                // Se crea una condición que evalua si el residuo es cero para realizar la respectiva operacion
                //al igual que si es diferente de 0
                if (tam % 2 == 0) {
                    int r = tam / 2;
                    int r2 = r - 1;
                    float aux2 = (float) (arr[r] + arr[r2]) / 2;
                    System.out.println(aux2);
                } else {
                    int r = tam / 2;
                    int aux3 = arr[r];
                    System.out.println(aux3);
                }
                System.out.println("Nuevamente:  ");
                peticion = sc.nextInt();
            }
            //Finalizamos la excepcion
        } catch (InputMismatchException e) {
            System.out.println("Debe ser un numero entero, intentelo nuevamente");

        }
    }
}
