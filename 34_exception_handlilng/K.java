
import java.io.FileNotFoundException;
import java.io.EOFException;

class X8
{
    void pro() throws FileNotFoundException
    {
        System.out.println("hello");
    }
}

class Y8 extends X8 
{
    // illegal method overriding :NEWER
    void pro() throws EOFException{ 
        System.out.println("hello");
    }
}

// D:\javaprac\34_exception_handlilng>javac K.java
// K.java:16: error: pro() in Y8 cannot override pro() in X8
//     void pro() throws EOFException{
//          ^
//   overridden method does not throw EOFException
// 1 error
