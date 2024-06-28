package singleton;

/**
 * Singleton "apressado".
 *
 * @author mlopes7599
 */
public class SingletonEager {

    //Criando instancia do proprio objeto
    private static SingletonEager instance = new SingletonEager();

    //Construtor privado não irá deixar ninguem instancia ele
    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return instance;
    }
}
