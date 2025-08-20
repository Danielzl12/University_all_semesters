import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Evento evento = new Evento();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        System.out.println("Bienvenido al registro de asistentes para el evento:");

        while(!salir) {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Registrar Evento");
            System.out.println("2. Registrar Asistente");
            System.out.println("3. Inscribir Asistente en Evento");
            System.out.println("4. Obtener informacion del asistente");
            System.out.println("5. Obtener informacion del evento");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Nuevo Evento ---");
                    System.out.print("Nombre del evento: ");
                    String nombreEvento = scanner.nextLine();

                    System.out.print("Día del evento (ej: 25): ");
                    int dia = scanner.nextInt();
                    System.out.print("Mes del evento (ej: 12 para Diciembre): ");
                    int mes = scanner.nextInt() - 1; // Calendar es 0-11
                    System.out.print("Año del evento (ej: 2025): ");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    Calendar cal = Calendar.getInstance();
                    cal.set(year, mes, dia);
                    System.out.println("Evento Registrado");evento.registrarEvento(new Evento(nombreEvento, cal.getTime()));
                    break;
                case 2:
                    System.out.println("\n--- Nuevo asistente ---");
                    System.out.print("Nombre del asistente a registrar: ");
                    String nombreAsistente = scanner.nextLine();
                    System.out.print("Email asistente: ");
                    String email = scanner.nextLine();
                    System.out.print("Numero de celular: ");
                    String numero = scanner.nextLine();
                    evento.agregarAsistente(new Asistentes(nombreAsistente, email, numero));
                    break;
                case 3:
                    System.out.println("\n--- Generar informacion ---");




            }
    }

}