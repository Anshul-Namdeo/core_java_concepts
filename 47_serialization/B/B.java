
          /********  -- __( B.java DeSerializable hai )__--  *************/
 
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class B 
{
    public static void main(String args[])
    {
        File file = new File("raju.txt");

        try{
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

           Shape shape = (Shape)ois.readObject();

           System.out.println(shape.length);
           System.out.println(shape.width);
           System.out.println(shape.height);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(FileNotFoundException  e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}