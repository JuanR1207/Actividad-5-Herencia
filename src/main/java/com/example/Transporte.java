public class Transporte {
    private String idTransporte;
    private double combustible;
    private double capacidadCarga;

    public Transporte(String idTransporte, double combustible, double capacidadCarga) {
        this.idTransporte = idTransporte;
        setCombustible(combustible);
        setCapacidadCarga(capacidadCarga);
    }

    public void setCombustible(double nivel) {
        if (nivel < 0) combustible = 0;
        else if (nivel > 100) combustible = 100;
        else combustible = nivel;
    }

    public void setCapacidadCarga(double carga) {
        if (carga < 0) System.out.println("Error: La capacidad de carga no puede ser negativa.");
        else capacidadCarga = carga;
    }

    public String getIdTransporte() { return idTransporte; }
    public double getCombustible()  { return combustible; }
    public double getCapacidadCarga(){ return capacidadCarga; }

    public void viajar(int distancia) {
        double consumo = distancia / 10.0;
        setCombustible(combustible - consumo);
        System.out.println("[" + idTransporte + "] Viajó " + distancia + " km. Combustible restante: " + combustible);
    }
}