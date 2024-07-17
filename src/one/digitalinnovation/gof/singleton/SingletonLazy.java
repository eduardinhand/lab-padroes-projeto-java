package one.digitalinnovation.gof.singleton;

/**
 * Singleton "preguiçoso".
 */
public class SingletonLazy {

    private static SingletonLazy instancia;
    
    private SingletonLazy() {
        super();
    }
    
    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }

    public void displayMessage() {
        System.out.println("SingletonLazy: Instância criada quando necessário!");
    }
}
