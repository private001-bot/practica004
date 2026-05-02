
// El adaptador "firma el contrato" de Pato
public class AdaptadorDrone implements Pato {
    
    // Guarda el Drone en su interior (Relación 1..1)
    private Drone drone;

    // Constructor para inyectar el Drone
    public AdaptadorDrone(Drone drone) {
        this.drone = drone;
    }

    @Override
    public void cuaquear() {
        // Cuando le piden cuaquear, el drone hace beep
        drone.beep();
    }

    @Override
    public void volar() {
        // Para simular que vuela, el drone debe despegar y luego girar su rotor
        drone.despegar();
        drone.girarRotor();
    }
}