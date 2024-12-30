import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class B 
{
    public static void main(String args[])
    {
        try{
            FileInputStream fis = new FileInputStream("emp.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee e = (Employee) ois.readObject();

            System.out.println(e.name);
            System.out.println(e.age);
            System.out.println(e.designation);
            System.out.println(e.salary);

            ois.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}