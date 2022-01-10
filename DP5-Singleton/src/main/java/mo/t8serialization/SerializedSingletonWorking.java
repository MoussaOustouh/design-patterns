package mo.t8serialization;

import java.io.Serializable;


/**
 * <b>Serialization and Singleton</b>
 * <br><br>
 * Sometimes in distributed systems, we need to implement {@link Serializable} interface
 * in Singleton class so that we can serialize and deserialize the object
 * <br>
 * The problem with serialized singleton class is that whenever we deserialize it,
 * it will create a new instance of the class, so it destroys the singleton pattern.
 * <br><br>
 * To overcome this scenario we have to provide the implementation of {@link SerializedSingletonWorking#readResolve()} method.
 * <br><br>
 * @author Moussa OUSTOUH
 * */
public class SerializedSingletonWorking implements Serializable {

    private static final long serialVersionUID = 1;

    private SerializedSingletonWorking(){}

    private static class SingletonHelper{
        private static final SerializedSingletonWorking instance = new SerializedSingletonWorking();
    }

    public static SerializedSingletonWorking getInstance(){
        return SingletonHelper.instance;
    }

    /**
     * By providing the implementation of {@link SerializedSingletonWorking#readResolve()} method
     * as below the serialized singleton will work.
     * */
    protected Object readResolve() {
        return getInstance();
    }
}
