import java.util.ArrayList;
import java.util.Scanner;
public class Consulta {
    private String fecha;
    private String hora;
    private Profesional profesional;
    private ArrayList<Paciente> pacientes;
    private ArrayList<Establecimiento> establecimientos;
    private ArrayList<Profesional> profesionals;
    Scanner scanner = new Scanner(System.in);

    public Consulta(String fecha, String hora, Profesional profesional, ArrayList<Paciente> pacientes, ArrayList<Establecimiento> establecimientos, ArrayList<Profesional> profesionals) {
        this.fecha = fecha;
        this.hora = hora;
        this.profesional = profesional;
        this.pacientes = pacientes;
        this.establecimientos = establecimientos;
        this.profesionals = profesionals;
    }

    public void crearConsulta(String fecha, String hora, Profesional profesional, ArrayList<Paciente> pacientes, ArrayList<Establecimiento> establecimientos, ArrayList<Profesional> profesionals) {

        Consulta consulta = new Consulta(fecha, hora, profesional, pacientes, establecimientos, profesionals);
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", profesional=" + profesional +
                ", pacientes=" + pacientes +
                ", establecimientos=" + establecimientos +
                ", profesionals=" + profesionals +
                ", scanner=" + scanner +
                '}';
    }
}
