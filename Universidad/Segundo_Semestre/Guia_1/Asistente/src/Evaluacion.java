import java.util.Date;

public class Evaluacion {
    String nombre_evaluacion;
    Date fecha_de_entrega;

    public Evaluacion(String nombre_evaluacion, Date fecha_de_entrega){
        this.nombre_evaluacion = nombre_evaluacion;
        this.fecha_de_entrega = fecha_de_entrega;
    }
    public String getNombre_evaluacion(){
        return nombre_evaluacion;
    }
    public Date getFecha_de_entrega(){
        return  fecha_de_entrega;
    }
}

