package Ejercicio_asignado;

public class inventario {
    public static void main(String[] args) {
        
    String[][] inAndOut = {
      {"Entrada: 23:45", "08:40"},
      {"Salida: 23:40", "5:40"},
      {"Entrada: 23:40", "5:40"}
    };
    Producto producto = new Producto("Champu", "", inAndOut);
    producto.mostrarRegistros(0);

    }
}



