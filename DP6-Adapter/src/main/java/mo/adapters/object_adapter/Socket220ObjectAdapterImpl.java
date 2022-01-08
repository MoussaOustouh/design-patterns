package mo.adapters.object_adapter;

import mo.adapters.Socket220;
import mo.adapters.SocketAdapter;
import mo.adapters.Volt;

/**
 * Rhe <b>Object Adapter</b> approach implementation, using <b>Composition</b> for <b>Adapter pattern</b>.
 * <br><br>
 * @author Moussa OUSTOUH
 * */
public class Socket220ObjectAdapterImpl implements SocketAdapter {
    // Using Composition
    private Socket220 socket220 = new Socket220();
    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getValue() / i);
    }

    @Override
    public Volt get120Volt() {
        return convertVolt(socket220.getVolt(), 2);
    }

    @Override
    public Volt get16To20Volt() {
        return convertVolt(socket220.getVolt(), 11);
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(socket220.getVolt(), 18);
    }

    @Override
    public Volt get6Volt() {
        return convertVolt(socket220.getVolt(), 36);
    }

    @Override
    public Volt get5Volt() {
        return convertVolt(socket220.getVolt(), 44);
    }
}
