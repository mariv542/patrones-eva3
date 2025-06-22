package src;

import src.bridge.AccionConcretaMaullar;
import src.bridge.Gato;
import src.iterator.Clan;
import src.prototype.GatoMagico;
import src.singleton.RegistroGatuno;

public class App {
    public static void main(String[] args) {

        System.out.println(" Bienvenido a CatWorld \n");

        // =======================
        // PATRÓN SINGLETON
        // =======================
        System.out.println("[ Singleton]");

        RegistroGatuno reg1 = RegistroGatuno.getInstancia();
        RegistroGatuno reg2 = RegistroGatuno.getInstancia();

        System.out.println("Registro 1: " + reg1.hashCode());
        System.out.println("Registro 2: " + reg2.hashCode());
        System.out.println("¿Ambos registros son iguales? " + (reg1 == reg2));
        System.out.println(" Singleton asegura que solo exista una instancia.\n");

        // =======================
        // PATRÓN PROTOTYPE
        // =======================
        System.out.println("[🧬 Prototype]");

        GatoMagico original = new GatoMagico("Nébula", "Invisibilidad");
        GatoMagico clon = original.clonar();

        System.out.println("Gato original: " + original);
        System.out.println("Gato clonado: " + clon);
        System.out.println(" Prototype permite copiar gatos mágicos fácilmente.\n");

        // =======================
        // PATRÓN BRIDGE
        // =======================
        System.out.println("[ Bridge]");

        Gato gatoAccion = new Gato("Zafiro", new AccionConcretaMaullar());
        System.out.println("El gato " + gatoAccion.getNombre() + " realiza su acción:");
        gatoAccion.realizarAccion();

        System.out.println(" Bridge separa la acción del gato de su definición, facilitando extensión.\n");

        // =======================
        // PATRÓN ITERATOR
        // =======================
        System.out.println("[ Iterator]");

        Clan clan = new Clan("Clan del Viento");
        clan.agregarGato(new GatoMagico("Bruma", "Teletransportación"));
        clan.agregarGato(new GatoMagico("Eco", "Sonido expansivo"));

        System.out.println("Recorriendo gatos del " + clan.getNombre() + ":");
        for (GatoMagico gm : clan) {
            System.out.println("- " + gm);
        }

        System.out.println(" Iterator permite recorrer los gatos sin exponer la estructura interna del Clan.\n");

        System.out.println(" ¡Demostración completa!");
    }
}
