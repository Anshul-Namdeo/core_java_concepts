class H1 
{
    class A 
    {
        A()
        {
            System.out.println("namaskaram,...");
        }
    }
}

class J 
{
    public static void main(String args[])
    {
        H1 h = new H1 ();
        // A x = h.new A();
        H1.A x = h.new A();
    }
}

// D:\javaprac\48_inner_classes>javac J.java

// D:\javaprac\48_inner_classes>java J
// namaskaram,...
