import java.util.ArrayList;
import java.util.List;
public class Consulta {
    private String fecha;
    private String hora;
    private String motivo;
    private List<Paciente> pacientes = new ArrayList<>();
    private List<Establecimiento> establecimientos = new ArrayList<>();
    private List<Profesional> profesionals = new ArrayList<>();
    private List<Consulta> consultas = new ArrayList<>();
    public Consulta(String fecha, String hora, String nombrePaciente,String apellidoPaciente, String dniPaciente,String motivo, String nombreProfesional,String apellidoProfesional, String dniProfesional, String nombreEstablecimiento, String ubicacionEstablecimiento, String tipoEstablecimiento) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
    }

}
