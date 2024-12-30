import java.io.FileReader;
import java.io.FileNotFoundException;

class L2
{
    public static void main(String[] args) {
        
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
    }
}

// D:\javaprac\33_exception_handling>javac L2.java
// L2.java:9: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         aaa();
//            ^
// 1 error
