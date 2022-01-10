package mo.factories;
/**
 * Generic {@link AbstractFactory} interface
 * <br><br>
 * @author Moussa OUSTOUH
 * */
public interface AbstractFactory<T> {
    T create(String type) ;
}
