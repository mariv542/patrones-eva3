package src.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import src.prototype.GatoMagico;

public class Clan implements Iterable<GatoMagico> {
    private String nombre;
    private List<GatoMagico> gatos;

    public Clan(String nombre) {
        this.nombre = nombre;
        this.gatos = new ArrayList<>();
    }

    public void agregarGato(GatoMagico gato) {
        gatos.add(gato);
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public Iterator<GatoMagico> iterator() {
        return gatos.iterator();
    }
}
