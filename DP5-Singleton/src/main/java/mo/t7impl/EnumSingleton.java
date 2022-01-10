package mo.t7impl;

/**
 * <b>Reflection can destroy the Singleton Pattern</b>
 * <br><br>
 * To overcome the situation with Reflection (Reflection can destroy the Singleton Pattern),
 * <a href="https://en.wikipedia.org/wiki/Joshua_Bloch" target="_blank">Joshua Bloch</a> suggests the use of Enum to implement Singleton design pattern as Java
 * ensures that any enum value is instantiated only once in a Java program.
 * <br>
 * Since Java Enum values are globally accessible, so it is singleton.
 * <br><br>
 * The drawback is that the enum type is somewhat inflexible.
 * E.g. it does not allow lazy initialization.
 * <br><br>
 * @author Moussa OUSTOUH
 * */
public enum EnumSingleton {

    INSTANCE;

    public static void doSomething(){
        //do something
    }
}
