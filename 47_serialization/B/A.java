
        /********  -- __( A.java Serializable hai )__--  *************/
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class A 
{
    public static void main(String args[])
    {
         Shape shape = new Shape(12,36,56);
        try{
             File file = new File("raju.txt");  //* raju.txt file khud se ban jayegi banane ki jarurat nhi padhegi*/
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(shape);

            oos.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}


// D:\javaprac\47_serialization\B>javac A.java

// D:\javaprac\47_serialization\B>java A

// D:\javaprac\47_serialization\B>javac B.java

// D:\javaprac\47_serialization\B>java B
// 12
// 36
// 56