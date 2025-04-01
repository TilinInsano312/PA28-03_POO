import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    private List<Paciente> pacientes = new ArrayList<>();
    private List<Establecimiento> establecimientos = new ArrayList<>();
    private List<Profesional> profesionals = new ArrayList<>();
    private List<Consulta> consultas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Sistema() {
    }

    // ********** Métodos para registrar **********
    public void registrarEstablecimiento() {
        System.out.println("Ingrese el nombre del establecimiento: ");

        String nombre = scanner.nextLine();
        System.out.println("Ingrese la ubicacion del establecimiento: ");
        String ubicacion = scanner.nextLine();
        System.out.println("Ingrese el tipo de establecimiento: ");
        String tipoEstablecimiento = scanner.nextLine();
        Establecimiento establecimiento = new Establecimiento(nombre, ubicacion, tipoEstablecimiento);
        establecimientos.add(establecimiento);
    }
    public void registrarProfesional() {
        String dni = "";
        boolean existe;
        System.out.println("Ingrese el nombre del profesional: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido del profesional: ");
        String apellido = scanner.nextLine();

        do {
            existe= false;
            System.out.println("Ingrese el DNI del profesional: ");
            dni = scanner.nextLine();
            for (Profesional profesional : profesionals) {
                if (profesional.getDni().equals(dni)) {
                    System.out.println("El DNI ya existe, ingrese otro DNI");
                    existe = true;
                }
            }
        }while (existe) ;

        System.out.println("Ingrese la especialidad del profesional: ");
        String especialidad = scanner.nextLine();
        System.out.println("Ingrese la experiencia del profesional: ");
        String experiencia = scanner.nextLine();
        Profesional profesional = new Profesional(nombre, apellido, dni, especialidad, experiencia, false);
        profesionals.add(profesional);
    }
    public void registrarPaciente () {
        System.out.println("Ingrese el nombre del paciente: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido del paciente: ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese el DNI del paciente: ");
        String dni = scanner.nextLine();
        System.out.println("Ingrese el telefono del paciente: ");
        String telefono = scanner.nextLine();
        Paciente paciente = new Paciente(nombre, apellido, dni, telefono);
        pacientes.add(paciente);
    }
    // ********** fin **********

    public Consulta crearConsulta(){
        String nombrePaciente = "";
        String apellidoPaciente = "";
        String nombreProfesional = "";
        String apellidoProfesional = "";
        String ubicacion = "";
        String tipoEstablecimiento = "";

        System.out.println("Ingrese la fecha de la consulta: ");
        String fecha = scanner.nextLine();
        System.out.println("Ingrese la hora de la consulta: ");
        String hora = scanner.nextLine();
        System.out.println("Ingrese el motivo de la consulta: ");
        String motivo = scanner.nextLine();
        System.out.println("Ingrese el DNI del paciente: ");
        String dniPaciente = scanner.nextLine();
        for ( Paciente paciente : pacientes) {
            if (paciente.getDni().equals(dniPaciente)) {
                System.out.println("Paciente encontrado");
                nombrePaciente = paciente.getNombre();
                apellidoPaciente = paciente.getApellido();
            }
        }
        System.out.println("Ingrese el DNI del profesional: ");
        String dniProfesional = scanner.nextLine();
        for ( Profesional profesional : profesionals) {
            if (profesional.getDni().equals(dniProfesional)) {
                System.out.println("Profesional encontrado");
                nombreProfesional = profesional.getNombre();
                apellidoProfesional = profesional.getApellido();
            }
        }
        System.out.println("Ingrese el nombre del establecimiento: ");
        String nombreEstablecimiento = scanner.nextLine();
        for ( Establecimiento establecimiento : establecimientos) {
            if (establecimiento.getNombre().equals(nombreEstablecimiento)) {
                System.out.println("Establecimiento encontrado");
                ubicacion = establecimiento.getUbicacion();
                tipoEstablecimiento = establecimiento.getTipoEstablecimiento();
            }
        }
        Consulta consulta =new Consulta(fecha, hora, nombrePaciente ,apellidoPaciente, dniPaciente, motivo,  nombreProfesional, apellidoProfesional, dniProfesional, nombreEstablecimiento, ubicacion, tipoEstablecimiento);
        consultas.add(consulta);
        return consulta;
    }
    public void eliminarConsulta(){
        System.out.println("Ingrese el DNI del paciente: ");
        String dniPaciente = scanner.nextLine();
        System.out.println("Ingrese la fecha de la consulta: ");
        String fechaConsulta = scanner.nextLine();
        for (Consulta consulta : consultas) {
            if (consulta.getPacientes().equals(dniPaciente) && consulta.getFecha().equals(fechaConsulta)) {
                consultas.remove(consulta);
                System.out.println("Consulta eliminada");
            }
        }
    }
    public void modificarConsulta(){
        System.out.println("Ingrese el DNI del paciente: ");
        String dniPaciente = scanner.nextLine();
        System.out.println("Ingrese la fecha de la consulta: ");
        String fechaConsulta = scanner.nextLine();
        for (Consulta consulta : consultas) {
            if (consulta.getPacientes().equals(dniPaciente) && consulta.getFecha().equals(fechaConsulta)) {
                System.out.println("Ingrese la nueva fecha de la consulta: ");
                consulta.setFecha(scanner.nextLine());
                System.out.println("Ingrese la nueva hora de la consulta: ");
                consulta.setHora(scanner.nextLine());
                System.out.println("Ingrese el nuevo motivo de la consulta: ");
                consulta.setMotivo(scanner.nextLine());
                System.out.println("Consulta modificada");
            }
        }
    }
}
