import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class A 
{
    public static void main(String args[]) throws IOException , ClassNotFoundException 
    {

        Student st = new Student("ansh", 98 , new Address ("Indore","mp"));

        File file = new File("bablu.txt");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(st);

        oos.close();
    }
}


// D:\javaprac\47_serialization\D>javac A.java

// D:\javaprac\47_serialization\D>java A
// Exception in thread "main" java.io.NotSerializableException: Address
//         at java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1197)
//         at java.base/java.io.ObjectOutputStream.defaultWriteFields(ObjectOutputStream.java:1582)
//         at java.base/java.io.ObjectOutputStream.writeSerialData(ObjectOutputStream.java:1539)
//         at java.base/java.io.ObjectOutputStream.writeOrdinaryObject(ObjectOutputStream.java:1448)
//         at java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1191)
//         at java.base/java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:354)