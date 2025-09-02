package Arrays;
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        // ACTIVIDAD UNO
        // Declaración y creación de un arreglo
        // Declarar un arreglo de 10 enteros en cada lenguaje dado, Inicializarlo con
        // valores aleatorios.
        int[] primerArreglo = { 1, 2, 6, 7, 8, 34, 23, 3, 23, 4 };

        // DOS
        // Recorrido e mostrar
        // Recorrerlo usando bucle for clásico.

        for (int i = 0; i < primerArreglo.length; i++) {
            System.out.println(
                    "Usted se encuentra en la posicion: " + i + " del arreglo, y el valor es: " + primerArreglo[i]);
        }

        // Recorrerlo usando un for-each o equivalente.
        int p = 1;
        for (int i : primerArreglo) {
            System.out.println("---------------------------");
            System.out.println("Usted se encuentra en la posicion: " + p + " del arreglo, y el valor es: " + i);
            p++;
        }

        // TRES
        // Modificación
        // Cambiar todos los valores impares por cero.
        for (int i = 0; i < primerArreglo.length; i++) {
            if (primerArreglo[i] % 2 != 0) {

                primerArreglo[i] = 0;
            }
        }
        System.out.println(java.util.Arrays.toString(primerArreglo));

        // Multiplicar todos los valores por su índice.
        for (int i = 0; i < primerArreglo.length; i++) {
            primerArreglo[i] = primerArreglo[i] * i;
        }
        System.out.println(java.util.Arrays.toString(primerArreglo));

        // CUATRO
        // Búsqueda
        // Implementar búsqueda lineal para encontrar un valor en el arreglo.
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Ingrese el valor del numero que desea saber");
            int valor = scanner.nextInt();

        
            boolean t = false;
            for (int i = 0; i < primerArreglo.length; i++) {
                for (int j = 0; j < primerArreglo.length; j++) {

                    if (valor == primerArreglo[j]) {
                        System.out.println("El numero: " + valor + " fue encontrado en la posicion " + j);
                        t = true;
                        break;
                    }
                }
                if (t == false) {
                System.out.println("No se encontro ese valor en el arreglo");
                break;
            }
            if ( t ){ break;}
            }
            
            scanner.close();

        } catch (Exception e) {
            System.out.println("Por favor ingrese solamente numeros ");
        }

    }
}
