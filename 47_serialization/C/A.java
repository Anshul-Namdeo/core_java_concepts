import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class A 
{
    public static void main(String args[]) throws IOException
    {

        Student st = new Student ("om",9, new Address("jabalpur","mp"));

        File file = new File("jay.txt");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(st);

        oos.close();
    }
}

// D:\javaprac\47_serialization\C>javac A.java

// D:\javaprac\47_serialization\C>java A
// Exception in thread "main" java.io.NotSerializableException: Student
//         at java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1197)
//         at java.base/java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:354)
//         at A.main(A.java:18)


// Note : Student class ko serializble nhi kiya tha isliye Exception aaya hai.