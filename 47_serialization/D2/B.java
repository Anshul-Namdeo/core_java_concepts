import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


class B 
{
    public static void main(String args[]) throws IOException, ClassNotFoundException
    {
        File file = new File("bablu.txt");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s = (Student) ois.readObject();

        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.address);
        System.out.println(s.address.city);
        System.out.println(s.address.state);
    }
}

// D:\javaprac\47_serialization\D2>javac B.java

// D:\javaprac\47_serialization\D2>java B
// ansh
// 98
// Address@5fa7e7ff
// null
// null