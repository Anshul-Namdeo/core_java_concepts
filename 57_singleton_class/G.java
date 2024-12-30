class X2 
{
    // early initialization

    private static X2 x = new X2();

    private X2()
    {

    }

    public static X2 getInstance()
    {
        return x;
    }
}

class G 
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


// D:\javaprac\57_singleton_class>javac G.java

// D:\javaprac\57_singleton_class>java G
// X2@36baf30c
// X2@36baf30c
// X2@36baf30c