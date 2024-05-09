package co.edu.uniquindio.poo;

// MetodosPorDefecto.java
public interface MetodosPorDefecto {
    default boolean autenticacion() {
        System.out.println("Método de autenticación por defecto.");
        return true;
    }
    
    default boolean buscarRuta() {
        System.out.println("Método de búsqueda de ruta por defecto.");
        return true;
    }

}