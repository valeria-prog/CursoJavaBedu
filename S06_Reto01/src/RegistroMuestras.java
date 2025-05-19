import java.util.*;

public class RegistroMuestras {
    public static void main(String[] args) {
        // Paso 1: ArrayList para registrar todas las especies en orden
        List<String> muestras = new ArrayList<>();
        muestras.add("Homo sapiens");
        muestras.add("Mus musculus");
        muestras.add("Arabidopsis thaliana");
        muestras.add("Homo sapiens");
        muestras.add("Mus musculus");
        muestras.add("Drosophila melanogaster");

        // Mostrar toda la lista de muestras en orden
        System.out.println("Lista completa y ordenada de muestras:");
        for (String especie : muestras) {
            System.out.println(especie);
        }
        System.out.println();

        // Paso 2: HashSet para obtener especies únicas
        Set<String> especiesUnicas = new HashSet<>(muestras);
        // Mostrar las especies únicas
        System.out.println("Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println(especie);
        }
        System.out.println();

        // Paso 3: HashMap para asociar ID de muestra con investigador
        Map<String, String> idInvestigador = new HashMap<>();
        idInvestigador.put("M-001", "Dra. López");
        idInvestigador.put("M-002", "Dr. Hernández");
        idInvestigador.put("M-003", "Prof. García");

        // Mostrar la relación de ID de muestra → investigador
        System.out.println("Relación de ID de muestra → investigador:");
        for (Map.Entry<String, String> entrada : idInvestigador.entrySet()) {
            System.out.println(entrada.getKey() + " → " + entrada.getValue());
        }
        System.out.println();

        // Paso 4: Búsqueda por ID de muestra
        String idABuscar = "M-002";
        System.out.println("Búsqueda por ID de muestra: " + idABuscar);
        String investigador = idInvestigador.get(idABuscar);
        if (investigador != null) {
            System.out.println("Investigador asignado: " + investigador);
        } else {
            System.out.println("No se encontró investigador para ese ID.");
        }
    }
}
