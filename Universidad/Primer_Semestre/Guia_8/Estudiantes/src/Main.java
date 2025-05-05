import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Gestor gestor = new Gestor();

        //interfaz tipo menu por medio de while y switch case
        String menu = """
                ---Menu de Gestion de estudiantes---
                1. Agregar estudiante
                2. Buscar estudiante por codigo
                3. Buscar estudiante por nombre
                4. Salir
                --------------------------------------------------
                Ingrese una opcion:\s""";

        String opcionElegida = "";
        while (!opcionElegida.equals("4")) {
            opcionElegida = JOptionPane.showInputDialog(null, menu);
            if (opcionElegida == null) {
                opcionElegida = "4";
            }else {
                opcionElegida = opcionElegida.trim();

                //switch para asignar las opciones a cada numero
                switch (opcionElegida){
                    case "1":
                        //logica para agregar estudiantes
                        String nombres = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
                        String carrera = JOptionPane.showInputDialog("Ingrese la carrera del estudiante: ");
                        String semestre = JOptionPane.showInputDialog("Ingrese el semestre del estudiante: ");
                        int codigoEstudiantil = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del estudiante: "));
                        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante: "));
                        Estudiante estudiante = new Estudiante(nombres, carrera, semestre);
                        estudiante.setCodigoEstudiantil(codigoEstudiantil);
                        estudiante.setEdad(edad);
                        gestor.adicionarEstudiante(estudiante);
                        JOptionPane.showMessageDialog(null, "Estudiante agregado correctamente");
                        break;
                    case "2":

                        JOptionPane.showMessageDialog(null, "Ha seleccionado buscar estudiante por codigo: ");


                        //logica para buscar estudiantes por codigo
                        int codigoBuscado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del estudiante a buscar: "));
                        Estudiante estudianteBuscado = gestor.buscarPorCodigo(codigoBuscado);
                        if (estudianteBuscado == null) {
                            JOptionPane.showMessageDialog(null, "El estudiante con el codigo " + codigoBuscado + " no existe");
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Estudiante encontrado:\n " +
                                    "Nombre: " + estudianteBuscado.getNombres() + "\n" +
                                    "Carrera: " + estudianteBuscado.getCarrera() + "\n" +
                                    "Semestre: " + estudianteBuscado.getSemestre() + "\n" +
                                    "Edad: " + estudianteBuscado.getEdad());
                            }
                        break;
                    case "3":

                        JOptionPane.showMessageDialog(null, "Ha seleccionado buscar estudiante por nombre: ");

                        //logica para buscar estudiantes por nombre
                        String nombreABuscar = JOptionPane.showInputDialog("Ingrese el nombre del estudiante a buscar: ");
                        Estudiante estudianteBuscadoPorNombre = gestor.buscarPorNombres(nombreABuscar);
                        if (estudianteBuscadoPorNombre == null) {
                            JOptionPane.showMessageDialog(null, "El estudiante con el nombre " + nombreABuscar + " no existe");
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Estudiante encontrado:\n " +
                                    "Codigo: " + estudianteBuscadoPorNombre.getCodigoEstudiantil() + "\n" +
                                    "Carrera: " + estudianteBuscadoPorNombre.getCarrera() + "\n" +
                                    "Semestre: " + estudianteBuscadoPorNombre.getSemestre() + "\n" +
                                    "Edad: " + estudianteBuscadoPorNombre.getEdad());
                            }
                        break;
                    case "4":
                        JOptionPane.showMessageDialog(null, "Ha salido del sistema");
                        break;
                    default:
                        throw new IllegalStateException("Opcion invalida: " + opcionElegida);
                }
            }
        }
    }
}