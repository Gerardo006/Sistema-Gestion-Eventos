import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear una ubicación
        Ubicacion ubicacion = new Ubicacion("Av. Los Paltas", "Cerca del parque", "Ciudad Loja", "Calle Principal", "Calle Secundaria");

        // Crear un evento
        Evento evento = new Evento("EVT123", "Conferencia ", new Date(), new Date(), Estado.PLANIFICADO, TipoEvento.CONFERENCIA, ubicacion);

        // Crear organizadores
        Organizador organizador1 = new Organizador("Juan Pérez", "juan@gmail.com", "1234567890", "0102030405", "org001");
        Organizador organizador2 = new Organizador("María Gómez", "maria@gmail.com", "0987654321", "1122334455", "org002");

        // Agregar organizadores al evento
        evento.agregarOrganizador(organizador1);
        evento.agregarOrganizador(organizador2);

        // Crear participantes
        Participante participante1 = new Participante("Ana López", "ana@gmail.com", "1357911131", "2233445566", "num001", TipoParticipante.ESTUDIANTE);
        Participante participante2 = new Participante("Luis Martínez", "luis@gmail.com", "2468101214", "6677889900", "num002", TipoParticipante.PROFESIONAL);

        // Agregar participantes al evento
        evento.agregarParticipante(participante1);
        evento.agregarParticipante(participante2);

        // Crear expositor
        Expositor expositor = new Expositor("Carlos Herrera", "carlos@example.com", "9988776655", "3344556677", "Inteligencia Artificial");

        // Mostrar detalles del evento
        evento.mostrarDetalles();

        // Expositor dirige el evento
        expositor.dirigirEvento();
    }
}
