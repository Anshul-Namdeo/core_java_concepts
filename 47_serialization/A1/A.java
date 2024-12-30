import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class A 
{
    public static void main(String args[])
    {
        Shape shape = new Shape(12,32,56);
        try{
            File file = new File("mohan.txt");
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(shape);
            oos.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}


// D:\javaprac\47_serialization\A1>javac A.java

// D:\javaprac\47_serialization\A1>java A

// D:\javaprac\47_serialization\A1>


// happily compile......