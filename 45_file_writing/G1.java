import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class G1 
{
    public static void main(String args[])
    {
        File file = new File("abc.txt");

        try{
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("i am learing go long");
            bw.newLine();
            bw.write("very easy to Understand");
            bw.newLine();
            bw.write("i reccommed you to learn tha language");

            bw.flush();
            bw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

// happily compile and run ....