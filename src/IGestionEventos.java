public interface IGestionEventos {
    void registrarParticipante(Participante participante);
    void eliminarParticipante(Participante participante);
    void agregarOrganizador(Organizador organizador);
    void eliminarOrganizador(Organizador organizador);
    void consultarParticipantes();
    void consultarOrganizadores();
}
