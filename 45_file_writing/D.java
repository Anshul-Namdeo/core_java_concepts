import java.io.FileWriter;
import java.io.IOException;

class D 
{
    public static void main(String args[])
    {
        try{

            FileWriter fw = new FileWriter("barbareek.txt");

            char[] x = {'1','^','A','c','-','_','\n','U','q'};

            fw.write(x);

            fw.flush();
            fw.close();


        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}

// hpily compile and run...