package mo.t5impl;

/**
 * <b>Bill Pugh implementation</b>
 * <br><br>
 * Prior to Java 5, java memory model had a lot of issues and the above approaches
 * used to fail in certain scenarios where too many threads try to get the instance
 * of the Singleton class simultaneously. So Bill Pugh came up with a different
 * approach to create the Singleton class using an <b><em>inner static helper class</em></b>.
 * <br><br>
 * When the singleton class is loaded, <code>{@link SingletonHelper}</code> class is not loaded into
 * memory and only when someone calls the <code>{@link BillPughSingleton#getInstance()}</code> method, this class gets
 * loaded and creates the Singleton class instance. This is the most widely used
 * approach for Singleton class as it doesn’t require synchronization.
 * <br><br>
 * @author Moussa OUSTOUH
 * */
public class BillPughSingleton {


    // private constructor to avoid using it
    private BillPughSingleton(){}

    // the private inner static helper class
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
