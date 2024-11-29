public class Organizador extends Persona {
    private String identificador;

    public Organizador(String nombre, String correo, String telefono, String cedula, String identificador) {
        super(nombre, correo, telefono, cedula);
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return nombre + " (" + identificador + ")";
    }
}
