class X2 
{

    private static X2 x;

    private X2()
    {

    }

    // lazy initialization
    public static X2 getInstance()
    {   
        if(x == null)
          x = new X2();

        return x;
    }
}

class H1 
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

// D:\javaprac\57_singleton_class>javac H1.java

// D:\javaprac\57_singleton_class>java H1
// X2@36baf30c
// X2@36baf30c
// X2@36baf30c