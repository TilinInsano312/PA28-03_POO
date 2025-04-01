public class Establecimiento {
    private String nombre;
    private String ubicacion;
    private String tipoEstablecimiento;

    public Establecimiento(String nombre, String ubicacion, String tipoEstablecimiento) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.tipoEstablecimiento = tipoEstablecimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoEstablecimiento() {
        return tipoEstablecimiento;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    @Override
    public String toString() {
        return "Establecimiento{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", tipoEstablecimiento='" + tipoEstablecimiento + '\'' +
                '}';
    }
}
