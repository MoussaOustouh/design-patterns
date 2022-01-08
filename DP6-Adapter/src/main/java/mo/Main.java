package mo;

import mo.adapters.SocketAdapter;
import mo.adapters.Volt;
import mo.adapters.class_adapter.Socket220ClassAdapterImpl;
import mo.adapters.object_adapter.Socket220ObjectAdapterImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("#--- Test Class Adapter ------------------------------------------------");
        SocketAdapter socket220ClassAdapter = new Socket220ClassAdapterImpl();
        Volt vc120 = socket220ClassAdapter.get120Volt();
        System.out.println("vc120 : " + vc120);
        Volt vc5 = socket220ClassAdapter.get5Volt();
        System.out.println("vc5 : " + vc5);


        System.out.println("#--- Test Object Adapter ------------------------------------------------");
        SocketAdapter socket220ObjectAdapter = new Socket220ObjectAdapterImpl();
        Volt vo120 = socket220ObjectAdapter.get120Volt();
        System.out.println("vo120 : " + vo120);
        Volt vo5 = socket220ObjectAdapter.get5Volt();
        System.out.println("vo5 : " + vo5);
    }
}
