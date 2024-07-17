package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder".
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    
    private SingletonLazyHolder() {
        super();
    }
    
    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }

    public void displayMessage() {
        System.out.println("SingletonLazyHolder: Instância segura e eficiente!");
    }
}

