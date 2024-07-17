package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado".
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();
    
    private SingletonEager() {
        super();
    }
    
    public static SingletonEager getInstancia() {
        return instancia;
    }

    public void displayMessage() {
        System.out.println("SingletonEager: Instância única pronta para uso!");
    }
}
