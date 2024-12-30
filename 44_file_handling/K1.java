import java.io.File;
import java.io.IOException;

class K1 
{
    public static void main(String args[]) throws IOException 
    {

        File file = new File("Python");

      System.out.println(  file.mkdir());

        File f1 = new File("Python/A.py");

      System.out.println(  f1.createNewFile());
    }
}


// D:\javaprac\44_file_handling>javac K1.java

// D:\javaprac\44_file_handling>java K1
// true
// true