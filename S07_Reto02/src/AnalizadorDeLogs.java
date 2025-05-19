import java.io.*;
import java.nio.file.*;

public class AnalizadorDeLogs {
    public static void main(String[] args) {
        Path rutaLog = Paths.get("errores.log");
        Path rutaFallo = Paths.get("registro_fallos.txt");

        int totalLineas = 0;
        int conteoErrores = 0;
        int conteoWarnings = 0;
        int lineasConErrores = 0;
        int lineasConWarnings = 0;

        try (BufferedReader br = Files.newBufferedReader(rutaLog)) {
            String linea;
            while ((linea = br.readLine()) != null) {
                totalLineas++;

                boolean hayError = false;
                boolean hayWarning = false;

                if (linea.contains("ERROR")) {
                    conteoErrores++;
                    hayError = true;
                }
                if (linea.contains("WARNING")) {
                    conteoWarnings++;
                    hayWarning = true;
                }
                if (hayError) {
                    lineasConErrores++;
                }
                if (hayWarning) {
                    lineasConWarnings++;
                }
            }

            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Cantidad de errores: " + conteoErrores);
            System.out.println("Cantidad de advertencias: " + conteoWarnings);
            double porcentajeErrores = totalLineas > 0 ? (double) lineasConErrores / totalLineas * 100 : 0;
            double porcentajeWarnings = totalLineas > 0 ? (double) lineasConWarnings / totalLineas * 100 : 0;
            System.out.printf("Porcentaje de líneas con errores: %.2f%%\n", porcentajeErrores);
            System.out.printf("Porcentaje de líneas con advertencias: %.2f%%\n", porcentajeWarnings);
        } catch (IOException e) {
            String mensajeError = "Error leyendo el archivo: " + e.getMessage();
            try (BufferedWriter bw = Files.newBufferedWriter(rutaFallo, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
                bw.write(mensajeError);
                bw.newLine();
            } catch (IOException ex) {
                System.out.println("Error al escribir en registro_fallos.txt: " + ex.getMessage());
            }
            System.out.println(mensajeError);
        }
    }
}