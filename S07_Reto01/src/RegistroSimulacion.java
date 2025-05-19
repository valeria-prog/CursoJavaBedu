import java.io.IOException;
import java.nio.file.*;

public class RegistroSimulacion {
    public static void guardarParametros(Path rutaArchivo, String parametros) {
        try {
            if (Files.notExists(rutaArchivo.getParent())) {
                Files.createDirectories(rutaArchivo.getParent());
            }
            Files.writeString(rutaArchivo, parametros);
        } catch (IOException e) {
            System.out.println("Error al guardar los parámetros: " + e.getMessage());
        }
    }

    public static void leerParametros(Path rutaArchivo) {
        try {
            if (Files.exists(rutaArchivo)) {
                String contenido = Files.readString(rutaArchivo);
                System.out.println("Contenido del archivo:");
                System.out.println(contenido);
            } else {
                System.out.println("El archivo no existe: " + rutaArchivo.toString());
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Path rutaArchivo = Paths.get("config", "parametros.txt");

        String parametros = "Tiempo de ciclo: 55.8 segundos\n" +
                "Velocidad de línea: 1.2 m/s\n" +
                "Número de estaciones: 8";

        guardarParametros(rutaArchivo, parametros);

        if (Files.exists(rutaArchivo)) {
            System.out.println("El archivo fue creado correctamente.");
        } else {
            System.out.println("El archivo no fue creado correctamente.");
        }

        leerParametros(rutaArchivo);
    }
}
