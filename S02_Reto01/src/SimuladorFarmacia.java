import java.util.Scanner;
public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese nombre del medicamento: ");
        String nombreMedicamento = sc.nextLine();
        System.out.println("Ingrese el precio unitario: ");
        double precioUnitario = sc.nextDouble();
        System.out.println("Ingrese la cantidad de piezas: ");
        int cantidadPiezas = sc.nextInt();

        var totalSinDescuento = (cantidadPiezas * precioUnitario);

        boolean aplicarDescuento = totalSinDescuento > 500.00;
        double descuento = aplicarDescuento ? totalSinDescuento * 0.15 : 0.00;
        double descuentoFinal = totalSinDescuento - descuento;
        System.out.println("Medicamento: " + nombreMedicamento);
        System.out.println("Cantidad: " + cantidadPiezas);
        System.out.println("Precio Unitario: $" + precioUnitario);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("¿Aplica descuento?: " + aplicarDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar $: " + descuentoFinal);

        sc.close();
    }

}
