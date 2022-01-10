package mo.t2impl;

import mo.t1impl.EagerSingleton;

/**
 * <b>Static block implementation</b>, the instance of the class is created in the static block.
 * <br><br>
 * This implementation is similar to <b>Eager implementation</b> ({@link EagerSingleton}),
 * except that instance of class is created in the static block that provides option for exceptions handling.
 * <br><br>
 * Both <b>Eager implementation</b> and <b>Static block implementation</b> creates the instance
 * even before it’s being used.
 * <br><br>
 * @author Moussa OUSTOUH
 * */
public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    // private constructor to avoid using it
    private StaticBlockSingleton(){

    }

    // static block initialization for exceptions handling
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("An exception occured in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}