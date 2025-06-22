package src.singleton;

public class RegistroGatuno {
    private static RegistroGatuno instancia;

    private RegistroGatuno() {
        System.out.println("RegistroGatuno inicializado.");
    }

    public static RegistroGatuno getInstancia() {
        if (instancia == null) {
            instancia = new RegistroGatuno();
        }
        return instancia;
    }
}