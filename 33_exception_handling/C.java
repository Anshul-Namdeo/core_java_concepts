import java.io.FileReader;
import java.io.FileNotFoundException;


class C
{
    public static void main(String args[])
    {
          System.out.println("A");
          
          try{
            FileReader r = new FileReader("abc.txt");
    
          }catch(FileNotFoundException e){
            e.printStackTrace();
          }

          System.out.println("B");
    }
}

// D:\javaprac\33_exception_handling>javac C.java

// D:\javaprac\33_exception_handling>java C
// A
// java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)
//         at java.base/java.io.FileInputStream.open0(Native Method)
//         at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
//         at java.base/java.io.FileReader.<init>(FileReader.java:60)
//         at C.main(C.java:12)
// B

// D:\javaprac\33_exception_handling>javac C.java

// D:\javaprac\33_exception_handling>java C
// A
// B

// D:\javaprac\33_exception_handling>
