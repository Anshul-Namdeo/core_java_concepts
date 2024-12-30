import java.io.File;
import java.io.IOException;

class L1
{
    public static void main(String args[]) throws IOException
    {
        File f1 = new File ("yamraj\\monu.txt");

        System.out.println(f1.createNewFile());
    }
}

 
// D:\javaprac\44_file_handling>javac L1.java

// D:\javaprac\44_file_handling>java L1
// Exception in thread "main" java.io.IOException: The system cannot find the path specified
//         at java.base/java.io.WinNTFileSystem.createFileExclusively(Native Method)
//         at java.base/java.io.File.createNewFile(File.java:1043)
//         at L1.main(L1.java:10)

// D:\javaprac\44_file_handling>
