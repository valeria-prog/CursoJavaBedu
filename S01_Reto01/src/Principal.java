import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Paciente p1 = new Paciente();

        System.out.println("Ingrese el nombre del paciente: ");
        p1.nombre = sc.nextLine();
        System.out.println("Ingrese el edad: ");
        p1.edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el expediente: ");
        p1.expediente = sc.nextLine();
        sc.close();

        p1.mostrarInformacion();
    }
}
