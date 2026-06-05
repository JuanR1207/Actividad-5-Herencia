public class BuqueCarga extends Transporte {
    private int cantidadContenedores;

    public BuqueCarga(String idTransporte, double combustible,
                      double capacidadCarga, int cantidadContenedores) {
        super(idTransporte, combustible, capacidadCarga);
        this.cantidadContenedores = cantidadContenedores;
    }

    public int getCantidadContenedores() { return cantidadContenedores; }
    public void setCantidadContenedores(int cantidadContenedores) {
        this.cantidadContenedores = cantidadContenedores;
    }

    public void atracarEnPuerto() {
        System.out.println("El buque [" + getIdTransporte() + "] ha atracado y está listo para descarga.");
    }

    public void mostrarDatos() {
        double costoViaje = cantidadContenedores * 150.0; // USD por contenedor
        System.out.println("=== Buque: " + getIdTransporte() + " ===");
        System.out.println("Combustible: " + getCombustible());
        System.out.println("Capacidad de carga: " + getCapacidadCarga());
        System.out.println("Contenedores: " + cantidadContenedores);
        System.out.println("Costo de viaje: $" + costoViaje + " USD");
    }
}