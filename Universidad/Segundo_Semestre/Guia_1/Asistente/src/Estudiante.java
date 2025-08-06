public class Estudiante {
    String nombres;
    String carrera;
    String semestre;
    int codigoEstudiantil;
    int edad;

    public Estudiante(String nombres, String carrera, String semestre, int codigoEstudiantil, int edad){
        this.nombres = nombres;
        this.carrera = carrera;
        this.semestre = semestre;
        this.codigoEstudiantil = codigoEstudiantil;
        this.edad = edad;
    }
    //instruccion para obtener y mostrar datos de la clase
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getSemestre() {
        return semestre;
    }
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    public int getCodigoEstudiantil() {
        return codigoEstudiantil;
    }
    public void setCodigoEstudiantil(int codigoEstudiantil) {
        this.codigoEstudiantil = codigoEstudiantil;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
