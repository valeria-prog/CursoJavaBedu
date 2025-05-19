public class PagoTransferencia extends MetodoPago implements Autenticable {
    private boolean validacionBancaria;

    public PagoTransferencia(double monto, boolean validacionBancaria) {
        super(monto);
        this.validacionBancaria = validacionBancaria;
    }

    @Override
    public boolean autenticar() {
        // Simula validación bancaria externa
        return validacionBancaria;
    }

    @Override
    public void procesarPago() {
        System.out.println("💰 Procesando transferencia bancaria por $" + monto);
    }
}
