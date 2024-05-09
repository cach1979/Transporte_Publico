package co.edu.uniquindio.poo;

// Administrador.java
public class Administrador implements PaginaWeb, InterfazEscritorio {
    
    @Override
    public void verHorarios() {
        System.out.println("Ver horarios de transporte público como administrador.");
    }
    
    @Override
    public void verRutasDisponibles() {
        System.out.println("Ver rutas disponibles de transporte público como administrador.");
    }
    
    @Override
    public void verTarifas() {
        System.out.println("Ver tarifas de transporte público como administrador.");
    }
    
    @Override
    public void autenticarUsuario() {
        System.out.println("Autenticar usuario en la página web como administrador.");
    }
    
    @Override
    public void buscarRuta() {
        System.out.println("Buscar ruta de transporte público como administrador.");
    }
    
    @Override
    public void generarReporte() {
        System.out.println("Generar reporte de transporte público como administrador.");
    }
}