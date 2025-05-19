import java.util.HashSet;
import java.util.Scanner;

public class MonitorCPU {
    public static void main(String[] args) {
        HashSet<Double> consumoServidores = new HashSet<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            boolean continuar = true;

            System.out.println("Ingrese los consumos de CPU por servidor. Escriba 'salir' para terminar.");

            while (continuar) {
                System.out.print("Ingrese consumo (%) del servidor: ");
                String entrada = scanner.nextLine();

                if (entrada.equalsIgnoreCase("salir")) {
                    continuar = false;
                    break;
                }

                double consumo;
                try {
                    consumo = Double.parseDouble(entrada);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Entrada inválida. Por favor ingrese un número válido.");
                    continue;
                }

                // Validaciones
                if (consumo < 0 || consumo > 100) {
                    System.out.println("Error: El valor debe estar entre 0 y 100.");
                    continue;
                }

                if (consumoServidores.contains(consumo)) {
                    System.out.println("Error: No se permiten registros duplicados.");
                    continue;
                }

                if (consumo > 95) {
                    throw new ConsumoCriticoException("¡Alerta! Consumo crítico en servidor: " + consumo + "%");
                }

                consumoServidores.add(consumo);
                System.out.println("Consumo registrado correctamente.");
            }

            System.out.println("\nResumen final:");
            System.out.println("Total de servidores con consumo registrado: " + consumoServidores.size());
            System.out.println("Consumos:");
            for (Double c : consumoServidores) {
                System.out.println("- " + c + "%");
            }

        } catch (ConsumoCriticoException e) {
            System.out.println("¡Excepción detectada: " + e.getMessage() + " Se detiene la monitorización.");

        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());

        } finally {
            if (scanner != null) {
                scanner.close();
                System.out.println("Recursos cerrados correctamente.");
            }
        }
    }
}
