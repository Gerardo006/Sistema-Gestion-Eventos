import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Evento implements IGestionEventos {
    private String identificador;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private Estado estado;
    private TipoEvento tipoEvento;
    private Ubicacion ubicacion;
    private List<Participante> participanteList;
    private List<Organizador> organizadorList;

    public Evento(String identificador, String nombre, Date fechaInicio, Date fechaFin, Estado estado, TipoEvento tipoEvento, Ubicacion ubicacion) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.tipoEvento = tipoEvento;
        this.ubicacion = ubicacion;
        this.participanteList = new ArrayList<>();
        this.organizadorList = new ArrayList<>();
    }

    public void agregarParticipante(Participante participante) {
        this.participanteList.add(participante);
    }

    @Override
    public void registrarParticipante(Participante participante) {
        agregarParticipante(participante);
    }

    @Override
    public void eliminarParticipante(Participante participante) {
        this.participanteList.remove(participante);
    }

    @Override
    public void agregarOrganizador(Organizador organizador) {
        this.organizadorList.add(organizador);
    }

    @Override
    public void eliminarOrganizador(Organizador organizador) {
        this.organizadorList.remove(organizador);
    }

    @Override
    public void consultarParticipantes() {
        System.out.println("Participantes:");
        for (Participante participante : participanteList) {
            System.out.println(participante);
        }
    }

    @Override
    public void consultarOrganizadores() {
        System.out.println("Organizadores:");
        for (Organizador organizador : organizadorList) {
            System.out.println("Nombre: " + organizador.getNombre());
            System.out.println("Correo: " + organizador.getCorreo());
            System.out.println("Teléfono: " + organizador.getTelefono());
            System.out.println("Cédula: " + organizador.getCedula());
            System.out.println("Identificador: " + organizador.toString());
            System.out.println();
        }
    }

    public void mostrarDetalles() {
        System.out.println("Evento: " + nombre);
        System.out.println("Identificador: " + identificador);
        System.out.println("Fecha Inicio: " + fechaInicio);
        System.out.println("Fecha Fin: " + fechaFin);
        System.out.println("Estado: " + estado);
        System.out.println("Tipo de Evento: " + tipoEvento);
        System.out.println("Ubicación: " + ubicacion);
        consultarOrganizadores();
        consultarParticipantes();
    }
}

