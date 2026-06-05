public class CamionDeReparto extends Transporte {
    private boolean tieneRefrigeracion;

    public CamionDeReparto(String idTransporte, double combustible,
                           double capacidadCarga, boolean tieneRefrigeracion) {
        super(idTransporte, combustible, capacidadCarga);
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    public boolean isTieneRefrigeracion() { return tieneRefrigeracion; }
    public void setTieneRefrigeracion(boolean tieneRefrigeracion) {
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    @Override
    public void viajar(int distancia) {
        double consumo = tieneRefrigeracion ? (distancia / 10.0) * 2 : distancia / 10.0;
        setCombustible(getCombustible() - consumo);
        System.out.println("[" + getIdTransporte() + "] Camión viajó " + distancia
                + " km (refrigeración: " + tieneRefrigeracion + "). Combustible restante: " + getCombustible());
    }
}