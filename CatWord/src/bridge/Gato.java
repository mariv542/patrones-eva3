package src.bridge;

public class Gato {
    private String nombre;
    private AccionGato accion;

    public Gato(String nombre, AccionGato accion) {
        this.nombre = nombre;
        this.accion = accion;
    }

    public String getNombre() {
        return nombre;
    }

    public void realizarAccion() {
        accion.ejecutar();
    }
}
