import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        double saldo = 1000.0;
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Bienvenido al cajero automatico ");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Consultar saldo: $" + saldo);
                    break;

                case 2:
                    System.out.println("Ingrese el valor de dinero a depositar: ");
                    double deposito = sc.nextDouble();

                    if (deposito <= 0) {
                        System.out.println("El valor de dinero no puede ser mayor que 0");
                        continue;
                    }
                    saldo += deposito;
                    System.out.println("Depósito exitoso. Nuevo saldo es: " + saldo);
                    break;

                case 3:
                    System.out.println("Ingrese el valor de dinero a retirar: ");
                    double retiro = sc.nextDouble();

                    if (retiro <= 0) {
                        System.out.println(" El monto debe ser mayor a cero.");
                        continue;
                    }

                    if (retiro > saldo) {
                        System.out.println("❌ Saldo insuficiente. No se puede realizar el retiro.");
                    } else {
                        saldo -= retiro;
                        System.out.println("✅ Retiro exitoso. Nuevo saldo: $" + saldo);
                    }
                    break;

                case 4:
                    System.out.println("👋 Gracias por usar el cajero. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while(opcion != 4);
        sc.close();
    }
}
