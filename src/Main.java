import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.*;

public class Main {
    public static void main(String[] args) {

        //Singleton

        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);
        singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);

        SingletonEager singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);
        singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder);
        singletonLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder);


        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento ofensivo = new ComportamentoOfensivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);

        robo.mover();
        robo.mover();


    }
}