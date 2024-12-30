import java.io.FileWriter;
import java.io.IOException;

class E 
{
    public static void main(String args[]) 
    {
        try{

            FileWriter fw = new FileWriter("Raju.txt");

            fw.write("Mohan");
            fw.write("is");
            fw.write("a");
            fw.write("good");
            fw.write("boy");

            fw.flush();
            fw.close();

        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}