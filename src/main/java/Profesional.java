public class Profesional {
    private String nombre;
    private String apellido;
    private String dni;
    private String especialidad;
    private String experiencia;
    private boolean estado;

    public Profesional(String nombre, String apellido, String dni, String especialidad, String experiencia, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.especialidad = especialidad;
        this.experiencia = experiencia;
        this.estado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public boolean isEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Profesional: " +
                "nombre=" + nombre + '\'' +
                ", apellido=" + apellido + '\'' +
                ", dni=" + dni + '\'' +
                ", especialidad=" + especialidad + '\'' +
                ", experiencia=" + experiencia + '\'' +
                ", estado=" + estado;
    }

}
