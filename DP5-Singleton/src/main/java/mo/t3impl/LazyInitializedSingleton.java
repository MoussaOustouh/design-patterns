package mo.t3impl;

/**
 * <b>Lazy implementation</b>, the instance of the class is created in in the global access method.
 *<br><br>
 * This implementation works fine in case of the single-threaded environment but when it comes
 * to multithreaded systems, it can cause issues if multiple threads are inside the if condition
 * at the same time. It will destroy the singleton pattern and both threads will get the different
 * instances of the singleton class.
 * <br><br>
 * @author Moussa OUSTOUH
 * */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    // private constructor to avoid using it
    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
