import java.io.File;
import java.io.IOException;

class F1
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

// D:\javaprac\44_file_handling>javac F1.java

// D:\javaprac\44_file_handling>java F
// true

// D:\javaprac\44_file_handling>java F
// false


// isa examples mai jub hum ne F1.javako phli war run kiya to file ban gai to true return kar diya isa method () ne . lekin jb F1.java ko dubara run kiya to usa ne false return kiya bez.. file pahle se bani thi isliye wo fir se ek new file nhi banayega.
