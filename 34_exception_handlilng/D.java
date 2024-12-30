import java.io.IOException;

class X1
{
    void pro() throws IOException 
    {
        System.out.println("hello");
    }
}

class Y1 extends X1 
{
    // legal method overriding :SAME
    void pro() throws IOException{
        System.out.println("hello");
    }
}

// happly compile