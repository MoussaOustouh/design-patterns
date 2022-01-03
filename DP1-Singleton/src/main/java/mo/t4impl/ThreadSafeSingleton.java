package mo.t4impl;

/**
 * <b>Thread safe implementation</b>, the instance of the singleton class is thread safe.
 * <br><br>
 * This implementation can be used to avoid of the destruction of the singleton pattern
 * if multiple threads are inside the if condition at the same time.
 * <br><br>
 * The easier way to create a thread-safe singleton class is to make the global access
 * method <code>synchronized</code>, so that only one thread can execute this method at a time.
 * <br><br>
 * @author Moussa OUSTOUH
 * */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    // private constructor to avoid using it
    private ThreadSafeSingleton(){}


    /**
     * This implementation works fine and provides thread-safety, but it reduces the performance
     * because of the cost associated with the <code>synchronized</code> method,
     * although we need it only for the first few threads who might create the separate instances.
     * */
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    /**
     * To avoid the extra overhead every time, double-checked locking principle is used.
     * <br>
     * The synchronized block is used inside the <code>if</code> condition with an additional
     * check to ensure that only one instance of a singleton class is created
     * */
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class) {
                if(instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
