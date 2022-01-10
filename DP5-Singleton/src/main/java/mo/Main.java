package mo;

import mo.t1impl.EagerSingleton;
import mo.t2impl.StaticBlockSingleton;
import mo.t3impl.LazyInitializedSingleton;
import mo.t4impl.ThreadSafeSingleton;
import mo.t5impl.BillPughSingleton;

public class Main {
    public static void main(String[] args) {
        // 1. Eager singleton initialization
        EagerSingleton instance1 = EagerSingleton.getInstance();

        // 2. Static block singleton initialization
        StaticBlockSingleton instance2 = StaticBlockSingleton.getInstance();

        // 3. Lazy singleton initialization
        LazyInitializedSingleton instance3 = LazyInitializedSingleton.getInstance();

        // 4. Thread safe singleton initialization
        ThreadSafeSingleton instance41 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton instance42 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();

        // 5. Bill Pugh singleton initialization
        BillPughSingleton instance5 = BillPughSingleton.getInstance();
    }
}
