package co.edu.uniquindio.poo;

// Viaje.java
public class Sistema_Transporte_Publico {
    public static void main(String[] args) {

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Usuario");
        System.out.println("");
        Usuario usuario = new Usuario();
        usuario.verHorarios();
        usuario.verRutasDisponibles();
        usuario.verTarifas();
        usuario.funcionBoleto();
        usuario.rastrearBus();
        usuario.autenticarUsuario();
        usuario.buscarRuta();
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------------------");
        
        System.out.println("");
        System.out.println("Administrador");
        System.out.println("");
        Administrador administrador = new Administrador();
        administrador.verHorarios();
        administrador.verRutasDisponibles();
        administrador.verTarifas();
        administrador.autenticarUsuario();
        administrador.buscarRuta();
        administrador.generarReporte();
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------------------");
        
        System.out.println("");
        System.out.println("Conductor");
        System.out.println("");
        Conductor conductor = new Conductor();
        conductor.verHorarios();
        conductor.verRutasDisponibles();
        conductor.verTarifas();
        conductor.funcionBoleto();
        conductor.rastrearBus();
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------------------");
        
        System.out.println("");
        System.out.println("Analsta de Datos");
        System.out.println("");
        AnalistaDatos analista = new AnalistaDatos();
        analista.funcionEspecifica();
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("");

    }
}