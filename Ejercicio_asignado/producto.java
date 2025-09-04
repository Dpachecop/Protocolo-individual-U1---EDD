package Ejercicio_asignado;

public record Producto(String nombre,
        String descripcion,
        String[][] inAndOut) {

    public void mostrarRegistros(int numeroIngreso) {
        System.out.print("Regstro de entradas y salidas" + "\n");
        for (int i = 0; i < inAndOut.length; i++) {
            for (int j = 0; j < inAndOut[i].length; j++) {
                System.out.print(inAndOut[i][numeroIngreso] + "\t");
             break;
            }
            System.out.println();
          
        }

    }
}
