import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class A 
{
    public static void main(String args[]) 
    {
        Employee emp = new Employee("Hitesh",37, "Manager",45000);
        try{
            FileOutputStream fos = new FileOutputStream("emp.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(emp);

            oos.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}



// D:\javaprac\47_serialization\E1>javac A.java

// D:\javaprac\47_serialization\E1>java A

// D:\javaprac\47_serialization\E1>javac B.java

// D:\javaprac\47_serialization\E1>java B
// Anshul
// 20
// Manager
// 45000