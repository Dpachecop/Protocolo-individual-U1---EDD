package matrices;
public class Matrices {

    public static void main(String[] args) {


        /*
        Declaración e inicialización
        Crear una matriz 3x3 de enteros en lenguaje de programación (Java)
        Inicializar con valores del 1 al 9.  */
        int[][] primeraMatriz = {
             { 1, 2, 3 }, 
             { 4, 5, 6 }, 
             { 7, 8, 9 }, 
            };
        
      


        /*
         Recorrido
        Imprimir la matriz en forma de tabla.
        Recorrerla por columnas.
         */
        for (int i = 0; i < primeraMatriz.length; i++) {
            for (int j = 0; j < primeraMatriz[i].length; j++) {
                System.out.print(primeraMatriz[i][j] + "\t" );
            }
            System.out.println();
        }
        

        /*
         Operaciones
        Sumar todos los elementos.
         */
        int sumatoriaMatriz = 0;
        for (int i = 0; i < primeraMatriz.length; i++) {
            for (int j = 0; j < primeraMatriz[i].length; j++) {
                sumatoriaMatriz += primeraMatriz[i][j];
            }

        }
        System.out.println("La sumatoria total de la matriz es: "+ sumatoriaMatriz);

        // Intercambiar la primera fila con la última.
        int n = 0; 
        for (int i = 0; i < primeraMatriz.length; i++) {
            for (int j = 0; j < primeraMatriz[i].length; j++) {
                if ( i == primeraMatriz.length - 1 ){
                    int nu = primeraMatriz[0][n];
                    primeraMatriz[0][n] = primeraMatriz[i][j];
                    primeraMatriz[2][n] = nu;
                    n++;
                }
            }
        }

         for (int i = 0; i < primeraMatriz.length; i++) {
            for (int j = 0; j < primeraMatriz[i].length; j++) {
                System.out.print(primeraMatriz[i][j] + "\t" );
            }
            System.out.println();
        }



    }

}