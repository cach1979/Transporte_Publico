package co.edu.uniquindio.poo;

// Usuario.java
public class Usuario implements AppMovil, PaginaWeb {

    @Override
    public void verHorarios() {
        System.out.println("Ver horarios de transporte público.");
    }
    
    @Override
    public void verRutasDisponibles() {
        System.out.println("Ver rutas disponibles de transporte público.");
    }
    
    @Override
    public void verTarifas() {
        System.out.println("Ver tarifas de transporte público.");
    }
    
    @Override
    public void funcionBoleto() {
        System.out.println("Comprar boleto de transporte público.");
    }
    
    @Override
    public void rastrearBus() {
        System.out.println("Rastrear bus de transporte público.");
    }
    
    @Override
    public void autenticarUsuario() {
        System.out.println("Autenticar usuario en la página web.");
    }
    
    @Override
    public void buscarRuta() {
        System.out.println("Buscar ruta de transporte público.");
    }
}
