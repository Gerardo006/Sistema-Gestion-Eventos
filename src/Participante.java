public class Participante extends Persona {
    private String identificador;
    private TipoParticipante tipoParticipante;

    public Participante(String nombre, String correo, String telefono, String cedula, String identificador, TipoParticipante tipoParticipante) {
        super(nombre, correo, telefono, cedula);
        this.identificador = identificador;
        this.tipoParticipante = tipoParticipante;
    }

    @Override
    public String toString() {
        return nombre + " (" + tipoParticipante + ")";
    }
}

