package src.bridge;

public class AccionConcretaMaullar implements AccionGato {
    @Override
    public void ejecutar() {
        System.out.println("🐱 Miau miau... (el gato maúlla con elegancia)");
    }
}
