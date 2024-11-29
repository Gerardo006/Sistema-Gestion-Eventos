public class Ubicacion {
    private String direccion;
    private String referencia;
    private String ciudad;
    private String callePrincipal;
    private String calleSecundaria;

    public Ubicacion(String direccion, String referencia, String ciudad, String callePrincipal, String calleSecundaria) {
        this.direccion = direccion;
        this.referencia = referencia;
        this.ciudad = ciudad;
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
    }

    @Override
    public String toString() {
        return direccion + ", " + referencia + ", " + ciudad + ", " + callePrincipal + ", " + calleSecundaria;
    }
}
