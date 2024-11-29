public class Expositor extends Persona {
    private String tema;

    public Expositor(String nombre, String correo, String telefono, String cedula, String tema) {
        super(nombre, correo, telefono, cedula);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void dirigirEvento() {
        System.out.println("Expositor " + nombre + " está dirigiendo el evento sobre: " + tema);
    }

    @Override
    public String toString() {
        return nombre + " (" + tema + ")";
    }
}

