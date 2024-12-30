import java.io.FileReader;
import java.io.FileNotFoundException;

class J 
{
        J() throws FileNotFoundException {
            FileReader r = new FileReader("abc.txt");
        }
    public static void main(String[] args) throws FileNotFoundException {
        
        System.out.println("A");

        J x = new J();

        System.out.println("B");
    }
}


// D:\javaprac\33_exception_handling>javac J.java

// D:\javaprac\33_exception_handling>java J
// A
// Exception in thread "main" java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)
//         at java.base/java.io.FileInputStream.open0(Native Method)
//         at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
//         at java.base/java.io.FileReader.<init>(FileReader.java:60)
//         at J.<init>(J.java:7)
//         at J.main(J.java:13)
