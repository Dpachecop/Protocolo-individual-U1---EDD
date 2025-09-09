package Ejercicio_asignado;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Inventario {
 
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // METODOS PA GESTINAR LOS PRODUCTOS

    public void agregarProducto(Producto producto) {
        if (buscarProducto(producto.getNombre()).isEmpty()) {
            this.productos.add(producto);
            System.out.println("Producto '" + producto.getNombre() + "' agregado al inventario.");
        } else {
            System.out.println("Error: El producto '" + producto.getNombre() + "' ya existe.");
        }
    }

    public Optional<Producto> buscarProducto(String nombre) {
        for (Producto p : this.productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return Optional.of(p);
            }
        }
        return Optional.empty(); 
    }

    // METODOS PARA REGISTRAR TODOS LOS MOVIMIENTOS EN EL INVENTARIO

    public void registrarEntrada(String nombreProducto, int cantidad) {
        Optional<Producto> productoOpt = buscarProducto(nombreProducto);
        if (productoOpt.isPresent()) {
            productoOpt.get().registrarEntrada(cantidad);
            System.out.println("Entrada registrada para '" + nombreProducto );
        } else {
            System.out.println("Error: No se encontró el producto '" + nombreProducto );
        }
    }

    public void registrarSalida(String nombreProducto, int cantidad) {
        Optional<Producto> productoOpt = buscarProducto(nombreProducto);
        if (productoOpt.isPresent()) {
            if (!productoOpt.get().registrarSalida(cantidad)) {
                System.out.println("Error: Stock insuficiente para '" + nombreProducto );
            } else {
                System.out.println("Salida registrada para '" + nombreProducto );
            }
        } else {
            System.out.println("Error: No se encontró el producto '" + nombreProducto );
        }
    }

    // --- Métodos de Reporte ---

    public void generarReporteExistencias() {
        System.out.println("\n---REPORTE DE EXISTENCIAS ---");
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }
        System.out.println("------------------------------------");
        System.out.printf("%-20s | %s\n", "Producto", "Stock Actual");
        System.out.println("------------------------------------");
        for (Producto p : productos) {
            System.out.printf("%-20s | %d\n", p.getNombre(), p.getStockActual());
        }
        System.out.println("------------------------------------\n");
    }

    public void generarReporteMovimientos() {
        System.out.println("\n---REPORTE DE MOVIMIENTOS ---");
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }
        for (Producto p : productos) {
            System.out.println("\n--- Historial de: " + p.getNombre() + " ---");
            if (p.getHistorialMovimientos().isEmpty()) {
                System.out.println("Sin movimientos registrados.");
            } else {
                for (String registro : p.getHistorialMovimientos()) {
                    System.out.println("  - " + registro);
                }
            }
        }
        System.out.println("\n--- FIN DEL REPORTE ---\n");
    }
}
