import java.util.Optional;
public class Factura {
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        if (rfc != null) {
            this.rfc = Optional.of(rfc);
        } else {
            this.rfc = Optional.empty();
        }
    }

    public String getResumen() {
        String rfcStr = rfc.isPresent() ? rfc.get() : "[No proporcionado]";
        return "Descripción: " + descripcion + "\n" +
                "Monto: $" + monto + "\n" +
                "RFC: " + rfcStr;
    }
}
