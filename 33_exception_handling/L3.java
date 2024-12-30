import java.io.FileReader;
import java.io.FileNotFoundException;

class L3
{
    public static void main(String[] args) throws FileNotFoundException {
        
        System.out.println("T");
        aaa();
        System.out.println("H");
    }

    static void aaa() throws FileNotFoundException{
        System.out.println("S");
        bbb();
        System.out.println("J");
    }

    static void bbb() throws FileNotFoundException {
        System.out.println("K");
        ccc();
        System.out.println("Q");
    }

    static void ccc() throws FileNotFoundException {

        FileReader r = new FileReader("abc.txt");
        System.out.println("R");
    }
 }

// D:\javaprac\33_exception_handling>javac L3.java

// D:\javaprac\33_exception_handling>java L3
// T
// S
// K
// Exception in thread "main" java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)
//         at java.base/java.io.FileInputStream.open0(Native Method)
//         at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
//         at java.base/java.io.FileReader.<init>(FileReader.java:60)
//         at L3.ccc(L3.java:27)
//         at L3.bbb(L3.java:21)
//         at L3.aaa(L3.java:15)
//         at L3.main(L3.java:9)
