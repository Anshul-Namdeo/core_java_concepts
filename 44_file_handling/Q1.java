import java.io.File;

class Q1
{
    public static void main(String args[])
    {
        File file = new File ("xyz/abc/a/m");

        System.out.println("Parent Path of M floder is : " + file.getParent());
    }
}


// D:\javaprac\44_file_handling>javac Q1.java

// D:\javaprac\44_file_handling>java Q1
// Parent Path of M floder is : xyz\abc\a