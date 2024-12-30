import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class G 
{
    public static void main(String args[])
    {
        File file = new File("hitachi.txt");

        try{

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("I am learing go long");
            bw.write("Very easy to understand");
            bw.write("i recommed you to learn the language");

            bw.flush();
            bw.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}