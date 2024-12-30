import java.io.File;

class Q 
{
    public static void main(String args[])
    {
        File file = new File ("xyz/abc");

        System.out.println(file.getParent());
    }
}


// D:\javaprac\44_file_handling>javac Q.java

// D:\javaprac\44_file_handling>java Q
// xyz
