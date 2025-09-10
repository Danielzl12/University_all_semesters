
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Universidad miUniversidad = new Universidad( "UMB", "Avenida Circumbalar #60-00");

        System.out.println("### SISTEMA DE REGISTRO DE " + miUniversidad.getNombre() + " ###\n");

        System.out.println("--- Registro de Estudiantes ---");
        for (int i = 0; i < 2; i++) {
            System.out.println("--> Ingresando Estudiante #" + (i + 1));
            miUniversidad.registrarPersona(crearEstudiante(scanner));
        }

        System.out.println("\n--- Registro de Docentes ---");
        for (int i = 0; i < 2; i++) {
            System.out.println("--> Ingresando Docente #" + (i + 1));
            miUniversidad.registrarPersona(crearDocente(scanner));
        }

        System.out.println("\n--- Registro de Administrativos ---");
        System.out.println("--> Ingresando Administrativo #1");
        miUniversidad.registrarPersona(crearAdministrativo(scanner));

        miUniversidad.mostrarListaPersonas();

        scanner.close();
    }

    private static Persona crearEstudiante(Scanner scanner) {
        System.out.print("Nombres: ");
        String nombres = scanner.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("Código de estudiante: ");
        String codigo = scanner.nextLine();
        System.out.print("Nro ID: ");
        int nroId = Integer.parseInt(scanner.nextLine());

        return new Estudiante(nombres, apellidos, nroId, "CC", codigo);
    }

    private static Persona crearDocente(Scanner scanner) {
        System.out.print("Nombres: ");
        String nombres = scanner.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("Departamento: ");
        String departamento = scanner.nextLine();
        System.out.print("Nro ID: ");
        int nroId = Integer.parseInt(scanner.nextLine());

        return new Docente(nombres, apellidos, nroId, "CC", departamento);
    }

    private static Persona crearAdministrativo(Scanner scanner) {
        System.out.print("Nombres: ");
        String nombres = scanner.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("Salario: ");
        String salario = scanner.nextLine();
        System.out.print("Nro ID: ");
        int nroId = Integer.parseInt(scanner.nextLine());

        return new Administrativo(nombres, apellidos, nroId, "CC", salario);
    }

}