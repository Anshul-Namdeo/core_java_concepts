class H 
{
    class A 
    {
        A() 
        {
            System.out.println("namaskaram....");
        }
    }

    public static void main(String args[])
    {
        H h = new H ();

        A x = h.new A();

        System.out.println(x);
    }
}

// D:\javaprac\48_inner_classes>javac H.java

// D:\javaprac\48_inner_classes>java H
// namaskaram....
// H$A@36baf30c