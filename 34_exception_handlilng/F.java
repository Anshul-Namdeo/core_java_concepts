import java.io.EOFException;
import java.io.FileNotFoundException;

class X3
{
    void pro() throws FileNotFoundException,EOFException 
    {
        System.out.println("hello");
    }
}

class Y3 extends X3 
{
    // legal method overriding :FEWER
    void pro() throws EOFException{
        System.out.println("hello");
    }
}