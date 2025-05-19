public class MainNarrativa {
    private TransicionHistoria transicion;
    private GestorDialogo dialogo;
    private LogicaDecision decision;

    public MainNarrativa(TransicionHistoria transicion, GestorDialogo dialogo, LogicaDecision decision) {
        this.transicion = transicion;
        this.dialogo = dialogo;
        this.decision = decision;
    }

    public void ejecutar() {
        dialogo.mostrarDialogo("¡Bienvenido a la historia!");

        boolean opcionElegida = decision.decidir();

        if (opcionElegida) {
            dialogo.mostrarDialogo("Has elegido continuar. La historia continúa...");
            transicion = new TransicionSimple("Escena de acción");
        } else {
            dialogo.mostrarDialogo("Terminaste la aventura aquí. Hasta luego.");
            transicion = new TransicionSimple("Fin");
        }

        System.out.println("Transición a: " + transicion.transitar());
    }

    public static void main(String[] args) {
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria(
                "¿Quieres seguir adelante?", "s", "n"
        );
        TransicionHistoria transicionInicial = new TransicionSimple("Inicio");
        MainNarrativa narrativa = new MainNarrativa(transicionInicial, dialogo, decision);
        narrativa.ejecutar();
    }
}

