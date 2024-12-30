
import java.io.FileNotFoundException;


class X6
{
    void pro() 
    {
        System.out.println("hello");
    }
}

class Y6 extends X6 
{
    // illegal method overriding :NEWER
    void pro() throws FileNotFoundException{
        System.out.println("hello");
    }
}

// D:\javaprac\34_exception_handlilng>javac I.java
// I.java:16: error: pro() in Y6 cannot override pro() in X6
//     void pro() throws FileNotFoundException{
//          ^
//   overridden method does not throw FileNotFoundException
// 1 error