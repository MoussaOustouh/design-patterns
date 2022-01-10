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
 * @author Moussa OUSTOUH
 * */
public class SerializedSingletonNotWorking implements Serializable {

    private static final long serialVersionUID = 1;

    private SerializedSingletonNotWorking(){}

    private static class SingletonHelper{
        private static final SerializedSingletonNotWorking instance = new SerializedSingletonNotWorking();
    }

    public static SerializedSingletonNotWorking getInstance(){
        return SingletonHelper.instance;
    }

}
