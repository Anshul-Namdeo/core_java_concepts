import java.io.PrintWriter;
import java.io.FileNotFoundException;

class H 
{
    public static void main(String args[]) throws FileNotFoundException 
    {
        PrintWriter pw = new PrintWriter("xyz.txt");

        pw.println("mohan is my best friend");
        pw.printf("He scored %.2f marks", 78.8f);
        pw.print(true);

        pw.flush();
        pw.close();
    }
}


// happily compile and run 