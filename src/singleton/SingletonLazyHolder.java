package singleton;

/**
 * Singleton "Lazy Holder".
 *
 * @see <a href="https://www.youtube.com/@giulianabezerra/videos">Referencia</a>
 *
 * @author mlopes7599
 */
public class SingletonLazyHolder {

    private static class InstanceHolder{
        //Criando instancia do proprio objeto
        public static SingletonLazyHolder instance = new SingletonLazyHolder();

    }

    //Construtor privado não irá deixar ninguem instancia ele
    private SingletonLazyHolder(){
        super();
    }

    //Criando um método estatico para pegar a instancia criada pela classe InstanceHolder
    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instance;
    }
}
