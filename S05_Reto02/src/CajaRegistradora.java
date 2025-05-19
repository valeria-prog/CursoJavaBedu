public class CajaRegistradora {
    public static void main(String[] args) {
        MetodoPago[] pagos = new MetodoPago[3];

        // Crear instancias de diferentes pagos
        pagos[0] = new PagoEfectivo(150.0);
        pagos[1] = new PagoTarjeta(320.0, 500.0); // Fondos suficientes
        pagos[2] = new PagoTransferencia(200.0, false); // Fallo en validación bancaria

        for (MetodoPago pago : pagos) {
            if (pago instanceof Autenticable) {
                Autenticable auth = (Autenticable) pago;
                if (auth.autenticar()) {
                    System.out.println("✅ Autenticación exitosa.");
                    pago.procesarPago();
                    pago.mostrarResumen();
                } else {
                    System.out.println("❌ Fallo de autenticación. " + pago.getClass().getSimpleName() + " no válida.");
                }
            }
        }
    }
}
