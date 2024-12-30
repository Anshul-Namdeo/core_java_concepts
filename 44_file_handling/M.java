import java.io.File;

class M 
{
    public static void main(String args[])
    {
        File f1 = new File("Yamraj.txt"); // yamraj File exists karni chahiye pahle se..

       // System.out.println(f1.isFile());

        File f2 = new File("CHITRAGUPT");// non-Exisisting file

        f1.renameTo(f2);
    }
}