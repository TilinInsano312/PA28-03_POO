import java.util.ArrayList;
import java.util.Scanner;
public class Consulta {
    private String fecha;
    private String hora;
    private String motivo;
    private Profesional profesional;
    private ArrayList<Paciente> pacientes;
    private ArrayList<Establecimiento> establecimientos;
    private ArrayList<Profesional> profesionals;

    public Consulta(String fecha, String hora, String nombrePaciente ,String apellidoPaciente, String dniPaciente, String motivo,  String nombreProfesional, String apellidoProfesional, String dniProfesional, String nombreEstablecimiento, String ubicacion, String tipoEstablecimiento) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;

    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public ArrayList<Establecimiento> getEstablecimientos() {
        return establecimientos;
    }

    public void setEstablecimientos(ArrayList<Establecimiento> establecimientos) {
        this.establecimientos = establecimientos;
    }

    public ArrayList<Profesional> getProfesionals() {
        return profesionals;
    }

    public void setProfesionals(ArrayList<Profesional> profesionals) {
        this.profesionals = profesionals;
    }
}
