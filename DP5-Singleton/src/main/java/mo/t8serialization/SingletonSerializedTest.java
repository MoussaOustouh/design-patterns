package mo.t8serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonSerializedTest {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        new File("temp-files").mkdirs();

        System.out.println("# --- For " + SerializedSingletonNotWorking.class.getName() + " ------------------------------");
        SerializedSingletonNotWorking instance1 = SerializedSingletonNotWorking.getInstance();
        // serialize the object and save it in the file
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("temp-files/filename1.txt"));
        out.writeObject(instance1);
        out.close();

        // read the file and deserialize to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("temp-files/filename1.txt"));
        SerializedSingletonNotWorking instance2 = (SerializedSingletonNotWorking) in.readObject();
        in.close();

        System.out.println("instance1 hashCode="+instance1.hashCode());
        System.out.println("instance2 hashCode="+instance2.hashCode());
        System.out.println("Singleton working : " + (instance1.hashCode() == instance2.hashCode()));

        System.out.println("");

        System.out.println("# --- For " + SerializedSingletonWorking.class.getName() + " ------------------------------");
        SerializedSingletonWorking instance3 = SerializedSingletonWorking.getInstance();
        // serialize the object and save it in the file
        ObjectOutput out2 = new ObjectOutputStream(new FileOutputStream("temp-files/filename2.txt"));
        out2.writeObject(instance3);
        out2.close();

        // read the file and deserialize to object
        ObjectInput in2 = new ObjectInputStream(new FileInputStream("temp-files/filename2.txt"));
        SerializedSingletonWorking instance4 = (SerializedSingletonWorking) in2.readObject();
        in2.close();

        System.out.println("instance3 hashCode="+instance3.hashCode());
        System.out.println("instance4 hashCode="+instance4.hashCode());
        System.out.println("Singleton working : " + (instance3.hashCode() == instance4.hashCode()));

    }

}