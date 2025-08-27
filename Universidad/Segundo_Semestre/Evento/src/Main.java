import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Evento miEvento = null;
        List<Asistentes> asistentesRegistrados = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        System.out.println("Bienvenido al sistema de gestión para su evento.");

        while(!salir) {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Configurar Evento");
            System.out.println("2. Registrar Nuevo Asistente");
            System.out.println("3. Registrar Nuevo Asistente VIP");
            System.out.println("4. Inscribir Asistente al Evento");
            System.out.println("5. Ver Resumen del Evento");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Configuración del Evento ---");
                    System.out.print("Nombre del evento: ");
                    String nombreEvento = scanner.nextLine();
                    System.out.print("Día del evento (ej: 25): ");
                    int dia = scanner.nextInt();
                    System.out.print("Mes del evento (ej: 12 para Diciembre): ");
                    int mes = scanner.nextInt() - 1;
                    System.out.print("Año del evento (ej: 2025): ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    Calendar cal = Calendar.getInstance();
                    cal.set(year, mes, dia);
                    miEvento = new Evento(nombreEvento, cal.getTime());
                    System.out.println(">> Evento '" + nombreEvento + "' creado.");
                    break;

                case 2:
                    System.out.println("\n--- Nuevo Asistente ---");
                    System.out.print("Nombre del asistente: ");
                    String nombreAsistente = scanner.nextLine();
                    System.out.print("Email del asistente: ");
                    String email = scanner.nextLine();
                    System.out.print("Número de celular: ");
                    String numero = scanner.nextLine();
                    Asistentes nuevoAsistente = new Asistentes(nombreAsistente, email, numero);
                    asistentesRegistrados.add(nuevoAsistente);
                    System.out.println(" Asistente '" + nombreAsistente + "' registrado en el sistema.");
                    break;

                case 3:
                    System.out.println("\n--- Nuevo Asistente VIP ---");
                    System.out.print("Nombre del asistente VIP: ");
                    String nombreAsistenteVIP = scanner.nextLine();
                    System.out.print("Email del asistente VIP: ");
                    String emailVIP = scanner.nextLine();
                    System.out.print("Número de celular: ");
                    String numeroVIP = scanner.nextLine();

                    // Aquí está la clave: creamos un objeto de la clase hija
                    Asistentes nuevoAsistenteVIP = new AsistenteVIP(nombreAsistenteVIP, emailVIP, numeroVIP);

                    // Lo guardamos en la MISMA lista de siempre. ¡Esto es polimorfismo!
                    asistentesRegistrados.add(nuevoAsistenteVIP);
                    System.out.println(">> Asistente VIP '" + nombreAsistenteVIP + "' registrado en el sistema.");
                    break;
                case 4:
                    System.out.println("\n--- Inscribir Asistente al Evento '" + miEvento.getNombre());
                    System.out.print("Nombre del asistente a inscribir: ");
                    String asistenteAInscribir = scanner.nextLine();
                    Asistentes asistenteEncontrado = null;
                    for (Asistentes a : asistentesRegistrados) {
                        if (a.getNombre().equalsIgnoreCase(asistenteAInscribir)) {
                            asistenteEncontrado = a;
                            break;
                        }
                    }
                    if (asistenteEncontrado != null) {
                        miEvento.agregarAsistente(asistenteEncontrado);
                    } else {
                        System.out.println(" No se encuentra un asistente con ese nombre.");
                    }
                    break;


                case 5:
                    System.out.println("RESUMEN DEL EVENTO");
                    System.out.println(" Nombre: " + miEvento.getNombre());
                    System.out.println(" Fecha: " + miEvento.getFecha());
                    System.out.println("️ Cupos disponibles: " + miEvento.getCuposDisponibles());
                    System.out.println(" Asistentes inscritos (" + miEvento.getPersonas_que_asisten().size() + "):");
                        for (Asistentes asistente : miEvento.getPersonas_que_asisten()) {
                        asistente.mostrarInformacion();
                        }

                    break;

                case 6:
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}