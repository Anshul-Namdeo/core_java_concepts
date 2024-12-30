class X2 
{

    private static X2 x;

    private X2()
    {

    }

    public static X2 getInstance()
    {
        x = new X2();
        return x;
    }
}

class H 
{
    public static void main(String args[])
    {
        X2 a1 = X2.getInstance();
        X2 a2 = X2.getInstance();
        X2 a3 = X2.getInstance();

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}

// D:\javaprac\57_singleton_class>javac H.java

// D:\javaprac\57_singleton_class>java H
// X2@36baf30c
// X2@7a81197d
// X2@5ca881b5