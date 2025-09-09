package Ejercicio_asignado;

public class Main {
    public static void main(String[] args) {
        
        Inventario miInventario = new Inventario();

        
        System.out.println("--- Cargando productos iniciales ---");
        miInventario.agregarProducto(new Producto("Laptop Gamer", 10));
        miInventario.agregarProducto(new Producto("Mouse Inalámbrico", 50));
        miInventario.agregarProducto(new Producto("Teclado Mecánico", 25));
        System.out.println();
        
        
        miInventario.generarReporteExistencias();
        
     
        System.out.println("\n--- Realizando operaciones de inventario ---");
        miInventario.registrarEntrada("Laptop Gamer", 5); 
        miInventario.registrarSalida("Mouse Inalámbrico", 15); 
        miInventario.registrarSalida("Teclado Mecánico", 30); 
        miInventario.registrarSalida("Monitor Curvo", 5); 
        System.out.println();
        

        miInventario.generarReporteExistencias();
        

        miInventario.generarReporteMovimientos();
    }
    }
