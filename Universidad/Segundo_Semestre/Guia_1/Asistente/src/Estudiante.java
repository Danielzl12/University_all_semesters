public class Estudiante {
    String nombres;
    String carrera;
    String semestre;

    public Estudiante(String nombres, String carrera, String semestre){
        this.nombres = nombres;
        this.carrera = carrera;
        this.semestre = semestre;
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
}
