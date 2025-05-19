import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    private String pregunta;
    private String opcionSi;
    private String opcionNo;

    public DecisionBinaria(String pregunta, String opcionSi, String opcionNo) {
        this.pregunta = pregunta;
        this.opcionSi = opcionSi;
        this.opcionNo = opcionNo;
    }

    @Override
    public boolean decidir() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(pregunta + " (" + opcionSi + "/" + opcionNo + ")");
        String respuesta = scanner.nextLine().trim().toLowerCase();
        return respuesta.equals(opcionSi.toLowerCase());
    }
}
