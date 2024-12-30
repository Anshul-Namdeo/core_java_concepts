import java.io.File;

class N1 
{
    public static void main(String args[])
    {
        File f1 = new File("VIKRAMADITYA"); // exists

        System.out.println(f1.isFile());

        File f2 = new File("CHANDRAGUPT"); // no-exists..

        f1.renameTo(f2);    
    }
}