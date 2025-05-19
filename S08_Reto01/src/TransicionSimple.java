public class TransicionSimple implements TransicionHistoria {
    private String proximaEscena;

    public TransicionSimple(String proximaEscena) {
        this.proximaEscena = proximaEscena;
    }

    @Override
    public String transitar() {
        return proximaEscena;
    }
}