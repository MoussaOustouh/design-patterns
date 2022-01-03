package mo.t1impl;

/**
 * <b>Eager implementation</b>, the instance of the singleton class is created at the time of class loading.
 * <br><br>
 * This is the easiest method to create a singleton class, but it has the drawback that instance
 * is created even it might not be used.
 * <br><br>
 * @author Moussa OUSTOUH
 * */
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    // private constructor to avoid constructor using
    private EagerSingleton(){

    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}
