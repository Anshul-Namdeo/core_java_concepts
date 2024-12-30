import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class A 
{
    public static void main(String args[])
    {
            Student s = new Student();

            s.name = "ram";
            s.age = 22;
            s.marks = 99.9f;
            s.contact = "5555555555";
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));
            oos.writeObject(s);

            oos.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}


// D:\javaprac\47_serialization\H>javac A.java

// D:\javaprac\47_serialization\H>java A

// D:\javaprac\47_serialization\H>javac B.java

// D:\javaprac\47_serialization\H>java B
// ram
// 22
// 0.0
// null
