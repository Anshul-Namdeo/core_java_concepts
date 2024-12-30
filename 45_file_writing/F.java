import java.io.FileWriter;
import java.io.IOException;

class F 
{
    public static void main(String args[])
    {
        try{
            FileWriter fw = new FileWriter("arjun.txt");

            char[] x = {'A','B','C','D','E','F','G','H','I','J','K','L'};
            fw.write(x,3,4);

            fw.flush();
            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}