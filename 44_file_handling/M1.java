import java.io.File;

class M1 
{
    public static void main(String args[])
    {
        File f1 = new File("CHITRAGUPT"); /// exists..

        // System.out.println(f1.isFile());

        File f2 = new File ("PRATHAM");

        f1.renameTo(f2);
    }
}