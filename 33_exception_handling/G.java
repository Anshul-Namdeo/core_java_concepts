import java.io.FileReader;
import java.io.FileNotFoundException;

class G
{
    G() /*throws FileNotFoundException*/ {

        FileReader r = new FileReader("abc.txt");
    }
}


// D:\javaprac\33_exception_handling>javac G.java
// G.java:8: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         FileReader r = new FileReader("abc.txt");
//                        ^
// 1 error