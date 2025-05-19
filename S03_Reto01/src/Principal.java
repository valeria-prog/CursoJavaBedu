public class Principal {
    public static void main(String[] args) {
        // Crear pasajero y vuelo
        Pasajero pasajero1 = new Pasajero("Ana Martínez", "A12345678");
        Vuelo vuelo1 = new Vuelo("UX123", "París", "14:30");

        // Reservar asiento
        if (vuelo1.reservarAsiento(pasajero1)) {
            System.out.println("Reserva realizada con éxito.\n");
        }

        // Mostrar itinerario
        System.out.println("✈️ Itinerario del vuelo:");
        System.out.println(vuelo1.obtenerItinerario() + "\n");

        // Cancelar reserva
        System.out.println("❌ Cancelando reserva...\n");
        vuelo1.cancelarReserva();

        // Mostrar itinerario
        System.out.println("✈️ Itinerario del vuelo:");
        System.out.println(vuelo1.obtenerItinerario() + "\n");

        // Reservar usando nombre y pasaporte
        if (vuelo1.reservarAsiento("Mario Gonzalez", "M98765432")) {
            System.out.println("Reserva realizada con éxito.\n");
        }

        // Mostrar itinerario final
        System.out.println("✈️ Itinerario del vuelo:");
        System.out.println(vuelo1.obtenerItinerario());
    }
}
