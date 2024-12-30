import java.io.FileReader;
import java.io.FileNotFoundException;

class L4
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

//  D:\javaprac\33_exception_handling>javac L4.java

// D:\javaprac\33_exception_handling>java L4
// T
// S
// K
// R
// Q
// J
// H