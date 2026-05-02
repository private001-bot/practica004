
public class PatoAdaptadorDemo {

    
    public static void main(String[] args) {
        PatoReal pato = new PatoReal();
        PavoSilvestre pavo = new PavoSilvestre();
        Pato adaptadorPavo = new AdaptadorPavo(pavo);
        SuperDrone miDrone = new SuperDrone();
        Pato adaptadorDrone = new AdaptadorDrone(miDrone);
        
        System.out.println("El pavo hace...");
        pavo.gluglutear();
        pavo.volar();
        
        System.out.println("\nEl pato hace... ");
        testPato(pato);
        
        System.out.println();
        
        System.out.println("El adaptador pavo hace...");
        testPato(adaptadorPavo);
        
        System.out.println();
        
        System.out.println("\nEl adaptador DRONE hace...");
        testPato(adaptadorDrone);
    }
    public static void testPato(Pato pato) {
        pato.cuaquear();
        pato.volar();
    }
}
