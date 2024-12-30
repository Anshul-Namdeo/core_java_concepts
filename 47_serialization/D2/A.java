import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class A 
{
    public static void main(String args[]) throws IOException 
    {

        Student st = new Student("ansh", 98 , new Address ("Indore","mp"));

        File file = new File("bablu.txt");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(st);

        oos.close();
    }
}

// D:\javaprac\47_serialization\D2>javac Address.java

// D:\javaprac\47_serialization\D2>javac A.java

// D:\javaprac\47_serialization\D2>java A

// D:\javaprac\47_serialization\D2>javac B.java

// D:\javaprac\47_serialization\D2>java B
// ansh
// 98
// null
// null
