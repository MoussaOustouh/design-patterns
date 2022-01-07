package mo.prototypes;

/**
 * The <code>CloneableInterface</code>
 * <br><br>
 * @author Moussa OUSTOUH
 * */
public interface PrototypeInterface<T> {

    /**
     * The {@link PrototypeInterface#cloneInstance()} method id the clone method that
     * the cloneable class should implement to create instance clones.
     * <br>
     * We used <code>cloneInstance</code> as name for the clone method, cause the {@link Object} class
     * that every class extends from, has already {@link Object#clone()} method.
     * <br><br>
     * We can also make the class instances cloneable by implement
     * {@link java.lang.Cloneable} interface and {@link Object#clone()} method.
     * */
    T cloneInstance();
}
