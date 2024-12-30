import java.io.IOException;
import java.io.FileNotFoundException;

class X4
{
    void pro() throws IOException 
    {
        System.out.println("hello");
    }
}

class Y4 extends X4 
{
    // legal method overriding :NARROWER
    void pro() throws FileNotFoundException{
        System.out.println("hello");
    }
}