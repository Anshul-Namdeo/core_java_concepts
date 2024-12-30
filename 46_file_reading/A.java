import java.io.FileReader;
import java.io.FileNotFoundException;

class A 
{
    public static void main(String args[]) throws FileNotFoundException 
    {
        FileReader reader = new FileReader("monu.txt"); // make sure file is not there at current context
    }
}

// D:\javaprac\46_file_reading>javac A.java

// D:\javaprac\46_file_reading>java A
// Exception in thread "main" java.io.FileNotFoundException: monu.txt (The system cannot find the file specified)
//         at java.base/java.io.FileInputStream.open0(Native Method)
//         at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
//         at java.base/java.io.FileReader.<init>(FileReader.java:60)
//         at A.main(A.java:8)
