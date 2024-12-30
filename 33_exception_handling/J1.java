import java.io.FileReader;
import java.io.FileNotFoundException;

class J1 
{
        J1() /*throws FileNotFoundException*/ {
            FileReader r = new FileReader("abc.txt");
        }
    public static void main(String[] args) throws FileNotFoundException {
        
        System.out.println("A");

        J1 x = new J1();

        System.out.println("B");
    }
}
