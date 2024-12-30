import java.io.File;
import java.io.IOException;

class F 
{
    public static void main(String args[])
    {
        File file = new File("Jiyan.txt");

        try
        {
            boolean flag = file.createNewFile();

            System.out.println(flag);
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}


// D:\javaprac\44_file_handling>javac F.java

// D:\javaprac\44_file_handling>java F
// true
