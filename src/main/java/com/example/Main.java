import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 1. Instanciación
        CamionDeReparto camion = new CamionDeReparto("CAM-001", 100, 5000, true);
        BuqueCarga buque = new BuqueCarga("BUQ-001", 100, 50000, 50);

        // 2. Prueba de fuego (validación del setter)
        camion.setCombustible(-20);
        System.out.println("Combustible del camión tras setCombustible(-20): " + camion.getCombustible());
        // Debe imprimir 0

        // Recargamos para la demo de polimorfismo
        camion.setCombustible(100);

        // 3. Demostración de polimorfismo
        ArrayList<Transporte> flota = new ArrayList<>();
        flota.add(camion);
        flota.add(buque);

        System.out.println("\n--- Todos viajan 100 km ---");
        for (Transporte t : flota) {
            t.viajar(100);
        }

        // Extra: métodos propios de BuqueCarga
        System.out.println();
        buque.atracarEnPuerto();
        buque.mostrarDatos();
    }
}