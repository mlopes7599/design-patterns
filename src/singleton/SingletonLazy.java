package singleton;

/**
 * Singleton "preguiçoso".
 *
 * @author mlopes7599
 */
public class SingletonLazy {

    //Criando instancia do proprio objeto
    private static SingletonLazy instance;

    //Construtor privado não irá deixar ninguem instancia ele
    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstance(){
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}
