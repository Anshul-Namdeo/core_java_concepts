import java.io.FileReader;


class B 
{
    public static void main(String args[])
    {
        FileReader r = new FileReader("abc.txt");
    }
}

// D:\javaprac\33_exception_handling>javac B.java
// B.java:8: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         FileReader r = new FileReader("abc.txt");
//                        ^
// 1 error
