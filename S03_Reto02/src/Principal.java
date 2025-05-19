public class Principal {
    public static void main(String[] args) {
        Factura facturaConRfc = new Factura(2500.0, "Servicio de consultoría", "ABCC010101XYZ");
        Factura facturaSinRfc = new Factura(1800.0, "Reparación de equipo", null);


        System.out.println("📄 Factura generada:");
        System.out.println(facturaConRfc.getResumen() + "\n");

        System.out.println("📄 Factura generada:");
        System.out.println(facturaSinRfc.getResumen());
    }
}
