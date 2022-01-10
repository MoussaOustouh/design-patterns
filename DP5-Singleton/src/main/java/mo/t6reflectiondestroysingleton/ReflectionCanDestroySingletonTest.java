package mo.t6reflectiondestroysingleton;

import mo.t5impl.BillPughSingleton;

import java.lang.reflect.Constructor;

/**
 * <b>Reflection can destroy the Singleton Pattern</b>
 * <br><br>
 * Reflection can be used to destroy all the above singleton implementation approaches.
 * <br><br>
 * @author Moussa OUSTOUH
 * */
public class ReflectionCanDestroySingletonTest {
    public static void main(String[] args) {
        BillPughSingleton instance1 = BillPughSingleton.getInstance();
        BillPughSingleton instance2 = null;
        try {
            Constructor[] constructors = BillPughSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instance2 = (BillPughSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("instance1 hashCode :" + instance1.hashCode());
        System.out.println("instance2 hashCode :" + instance2.hashCode());
        System.out.println("Singleton destroyed : " + (instance1.hashCode() != instance2.hashCode()));
    }

}
