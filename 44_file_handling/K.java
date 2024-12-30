import java.io.File;
import java.io.IOException;

class K 
{
    public static void main(String args[]) throws IOException 
    {

        File file = new File("JAVA");

      System.out.println(  file.mkdir());

        File f1 = new File("JAVA/A.java");

      System.out.println(  f1.createNewFile());
    }
}


// D:\javaprac\44_file_handling>javac K.java

// D:\javaprac\44_file_handling>java K
// true
// true