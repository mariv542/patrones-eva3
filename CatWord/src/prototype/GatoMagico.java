package src.prototype;

public class GatoMagico implements Cloneable {
    private String nombre;
    private String habilidad;

    public GatoMagico(String nombre, String habilidad) {
        this.nombre = nombre;
        this.habilidad = habilidad;
    }

    public GatoMagico clonar() {
        try {
            return (GatoMagico) this.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public String toString() {
        return "GatoMagico{" + nombre + " con habilidad: " + habilidad + "}";
    }
}