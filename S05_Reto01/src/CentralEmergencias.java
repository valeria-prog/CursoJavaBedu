public class CentralEmergencias {
    public static void main(String[] args) {
        Ambulancia ambulance = new Ambulancia("Ambulancia", "Juan");
        Patrulla patrol = new Patrulla("Patrulla", "Laura");
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", "Marco");

        ambulance.iniciarOperacion();
        patrol.iniciarOperacion();
        bomberos.iniciarOperacion();
    }
}
