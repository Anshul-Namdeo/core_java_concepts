import java.io.File;

class N 
{
    public static void main(String args[])
    {
        File f1 = new File("VIKRAMADITYA"); // non - exisiting file

        File f2 = new File("PRATHAM");  // exists file

        f2.renameTo(f1);
    }
}