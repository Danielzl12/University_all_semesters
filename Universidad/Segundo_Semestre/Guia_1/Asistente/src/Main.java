import java.util.Scanner;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Asistente asistente = new Asistente();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        System.out.println("¡Bienvenido al Asistente Universitario Interactivo!");

        while (!salir) {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Registrar Asignatura");
            System.out.println("3. Inscribir Estudiante en Asignatura"); // <-- NUEVA OPCIÓN
            System.out.println("4. Agregar Evaluación a Asignatura");
            System.out.println("5. Generar Alertas");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Nuevo Estudiante ---");
                    System.out.print("Nombre completo: ");
                    String nombreEst = scanner.nextLine();
                    System.out.print("Carrera: ");
                    String carrera = scanner.nextLine();
                    System.out.print("Semestre: ");
                    String sem = scanner.nextLine();
                    asistente.registrarEstudiante(new Estudiante(nombreEst, carrera, sem));
                    System.out.println("¡Estudiante registrado!");
                    break;
                case 2:
                    System.out.println("\n--- Nueva Asignatura ---");
                    System.out.print("Nombre de la asignatura: ");
                    String nomAsignatura = scanner.nextLine();
                    System.out.print("Modalidad: ");
                    String mod = scanner.nextLine();
                    asistente.registrarAsignaturas(new Asignatura(nomAsignatura, mod));
                    System.out.println("¡Asignatura registrada!");
                    break;
                case 3: // --- LÓGICA PARA INSCRIBIR ---
                    System.out.println("\n--- Inscribir Estudiante en Asignatura ---");
                    List<Estudiante> listaEstudiantes = asistente.getEstudiantesRegistrados();
                    List<Asignatura> listaAsignaturas = asistente.getAsignaturasRegistradas();

                    if (listaEstudiantes.isEmpty() || listaAsignaturas.isEmpty()) {
                        System.out.println("Debes registrar al menos un estudiante y una asignatura primero.");
                        break;
                    }

                    System.out.println("Selecciona el estudiante:");
                    for (int i = 0; i < listaEstudiantes.size(); i++) {
                        System.out.println((i + 1) + ". " + listaEstudiantes.get(i).getNombres());
                    }
                    int idxEst = scanner.nextInt() - 1;

                    System.out.println("Selecciona la asignatura a inscribir:");
                    for (int i = 0; i < listaAsignaturas.size(); i++) {
                        System.out.println((i + 1) + ". " + listaAsignaturas.get(i).getNombre_asignatura());
                    }
                    int idxAsig = scanner.nextInt() - 1;
                    scanner.nextLine(); // Limpiar

                    if (idxEst >= 0 && idxEst < listaEstudiantes.size() && idxAsig >= 0 && idxAsig < listaAsignaturas.size()) {
                        Estudiante estSeleccionado = listaEstudiantes.get(idxEst);
                        Asignatura asigSeleccionada = listaAsignaturas.get(idxAsig);
                        estSeleccionado.inscribirAsignatura(asigSeleccionada);
                        System.out.println("¡" + estSeleccionado.getNombres() + " inscrito en " + asigSeleccionada.getNombre_asignatura() + "!");
                    } else {
                        System.out.println("Selección inválida.");
                    }
                    break;
                case 4:
                    System.out.println("\n--- Agregar Evaluación ---");
                    List<Asignatura> asignaturasDisp = asistente.getAsignaturasRegistradas();
                    if (asignaturasDisp.isEmpty()) {
                        System.out.println("No hay asignaturas registradas.");
                        break;
                    }

                    System.out.println("Selecciona la asignatura:");
                    for (int i = 0; i < asignaturasDisp.size(); i++) {
                        System.out.println((i + 1) + ". " + asignaturasDisp.get(i).getNombre_asignatura());
                    }
                    int idxAsigEval = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (idxAsigEval >= 0 && idxAsigEval < asignaturasDisp.size()) {
                        Asignatura asigEval = asignaturasDisp.get(idxAsigEval);
                        System.out.print("Nombre de la evaluación: ");
                        String nomEval = scanner.nextLine();
                        System.out.print("Día de entrega (ej: 25): ");
                        int dia = scanner.nextInt();
                        System.out.print("Mes de entrega (ej: 12 para Diciembre): ");
                        int mes = scanner.nextInt() - 1; // Calendar es 0-11
                        System.out.print("Año de entrega (ej: 2025): ");
                        int year = scanner.nextInt();
                        scanner.nextLine();

                        Calendar cal = Calendar.getInstance();
                        cal.set(year, mes, dia);
                        asigEval.agregar_evaluacion(new Evaluacion(nomEval, cal.getTime()));
                        System.out.println("¡Evaluación agregada!");
                    } else {
                        System.out.println("Selección inválida.");
                    }
                    break;
                case 5:
                    asistente.generarAlertas();
                    break;
                case 6:
                    salir = true;
                    System.out.println("¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}