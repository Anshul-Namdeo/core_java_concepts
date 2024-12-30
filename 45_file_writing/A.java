import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class A 
{
    public static void main(String args[]) throws IOException
    {
        File file = new File("jay.txt");
        FileWriter fw = new FileWriter(file); // FileWriter Constructor creates a file if one does not exists...
    }
}

// happily compile ..

// Note : jaise hi hum ne FileWriter ke constructor main File ka variablr(file) pass kiya tha to jay file ban gai...