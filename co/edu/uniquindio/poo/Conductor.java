package co.edu.uniquindio.poo;

// Conductor.java
public class Conductor implements AppMovil {
    @Override
    public void verHorarios() {
        System.out.println("Ver horarios de transporte público como conductor.");
    }
    
    @Override
    public void verRutasDisponibles() {
        System.out.println("Ver rutas disponibles de transporte público como conductor.");
    }
    
    @Override
    public void verTarifas() {
        System.out.println("Ver tarifas de transporte público como conductor.");
    }
    
    @Override
    public void funcionBoleto() {
        System.out.println("Vender boleto de transporte público a usuaro.");
    }
    
    @Override
    public void rastrearBus() {
        System.out.println("Rastrear bus de transporte público como conductor.");
    }
}
