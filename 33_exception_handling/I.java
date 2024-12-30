import java.io.FileReader;
import java.io.FileNotFoundException;

class I 
{
    I() throws FileNotFoundException {
        FileReader r = new FileReader("abc.txt");
    }
    public static void main(String[] args) {
      
        System.out.println("A");

        try{
            I x = new I();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
        System.out.println("B");
    }
}

// D:\javaprac\33_exception_handling>javac I.java

// D:\javaprac\33_exception_handling>java I
// A
// java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)
//         at java.base/java.io.FileInputStream.open0(Native Method)
//         at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
//         at java.base/java.io.FileReader.<init>(FileReader.java:60)
//         at I.<init>(I.java:7)
//         at I.main(I.java:14)
// B
