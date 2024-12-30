import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.EOFException;

class X7
{
    void pro() throws FileNotFoundException
    {
        System.out.println("hello");
    }
}

class Y7 extends X7 
{
    // illegal method overriding :WIDER
    void pro() throws IOException{ 
        System.out.println("hello");
    }
}

// D:\javaprac\34_exception_handlilng>javac J.java
// J.java:16: error: pro() in Y7 cannot override pro() in X7
//     void pro() throws IOException{
//          ^
//   overridden method does not throw IOException
// 1 error
