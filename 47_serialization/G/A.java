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
            s.age = 12;
            s.marks = 99.9f;
            s.contact = "55555555555555";
        try{
            ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream("Student.txt"));
            oos.writeObject(s);

            oos.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}


// D:\javaprac\47_serialization\G>javac A.java

// D:\javaprac\47_serialization\G>java A

// D:\javaprac\47_serialization\G>javac B.java

// D:\javaprac\47_serialization\G>java B
// ram
// 12
// 0.0
// null
