import java.io.FileReader;
import java.io.FileNotFoundException;

class J2
{
        J2() {
            try
            {
                FileReader r = new FileReader("abc.txt");
            }catch( FileNotFoundException e){
                e.printStackTrace();
            }
           
        }
    public static void main(String[] args) throws FileNotFoundException {
        
        System.out.println("A");

        J2 x = new J2();

        System.out.println("B");
    }
}


// D:\javaprac\33_exception_handling>javac J2.java

// D:\javaprac\33_exception_handling>java J2
// A
// java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)
//         at java.base/java.io.FileInputStream.open0(Native Method)
//         at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
//         at java.base/java.io.FileReader.<init>(FileReader.java:60)
//         at J2.<init>(J2.java:9)
//         at J2.main(J2.java:19)
// B
