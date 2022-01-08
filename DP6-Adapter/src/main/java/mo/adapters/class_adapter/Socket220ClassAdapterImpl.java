package mo.adapters.class_adapter;

import mo.adapters.Socket220;
import mo.adapters.SocketAdapter;
import mo.adapters.Volt;

/**
 * Rhe <b>Class Adapter</b> approach implementation, using <b>Inheritance</b> for <b>Adapter pattern</b>.
 * <br><br>
 * @author Moussa OUSTOUH
 * */

// Using Inheritance
public class Socket220ClassAdapterImpl extends Socket220 implements SocketAdapter {
    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getValue() / i);
    }

    @Override
    public Volt get120Volt() {
        return convertVolt(super.getVolt(), 2);
    }

    @Override
    public Volt get16To20Volt() {
        return convertVolt(super.getVolt(), 11);
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(super.getVolt(), 18);
    }

    @Override
    public Volt get6Volt() {
        return convertVolt(super.getVolt(), 36);
    }

    @Override
    public Volt get5Volt() {
        return convertVolt(super.getVolt(), 44);
    }
}
