import java.io.File;
import java.io.IOException;

class L 
{
    public static void main(String args[]) throws IOException
    {
        File f1 = new File ("D:\\javaprac","44_file_handling\\monu.txt");

        System.out.println(f1.createNewFile());
    }
}


// D:\javaprac\44_file_handling>javac L.java

// D:\javaprac\44_file_handling>java L
// true