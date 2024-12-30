import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.EOFException;

class X5
{
    void pro() throws IOException 
    {
        System.out.println("hello");
    }
}

class Y5 extends X5 
{
    // legal method overriding :NARROWER
    void pro() throws FileNotFoundException,EOFException{
        System.out.println("hello");
    }
}