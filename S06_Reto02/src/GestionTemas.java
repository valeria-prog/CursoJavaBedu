import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class GestionTemas {
    public static void main(String[] args) {
        // Use CopyOnWriteArrayList para gestionar temas activos
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));
        temas.add(new Tema("Álgebra avanzada", 2));
        temas.add(new Tema("Historia antigua", 1));


        System.out.println("Temas ordenados por título:");
        Collections.sort(temas); // usa compareTo()
        for (Tema t : temas) {
            System.out.println(t);
        }
        System.out.println();

        System.out.println("Temas ordenados por prioridad (1 a 3):");
        temas.sort(Comparator.comparingInt(Tema::getPrioridad));
        for (Tema t : temas) {
            System.out.println(t);
        }
        System.out.println();

        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/medio");
        recursos.put("Álgebra avanzada", "https://recursos.edu/algebra");
        recursos.put("Historia antigua", "https://recursos.edu/historia");

        System.out.println("Repositorio de recursos:");
        for (Map.Entry<String, String> entrada : recursos.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

        String tituloBusqueda = "Matemáticas básicas";
        System.out.println("\nBuscando recurso para: " + tituloBusqueda);
        String enlace = recursos.get(tituloBusqueda);
        if (enlace != null) {
            System.out.println("Enlace: " + enlace);
        } else {
            System.out.println("Recurso no encontrado.");
        }
    }
}