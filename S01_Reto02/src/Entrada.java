public class Entrada {
    String nombreEvento;
    Double precioEntrada;

    public Entrada(String nombreEvento, Double precioEntrada) {
        this.nombreEvento = nombreEvento;
        this.precioEntrada = precioEntrada;
    }
    public void mostrarInformacion() {
        System.out.println("Evento: " + this.nombreEvento + " | Precio: $" + this.precioEntrada);
    }
}
