abstract class H1 
{
    abstract void pro() ;
}

class P1 
{
    static  H1 y = new H1 () {
        void pro()
        {
            System.out.println("namaste");
        }
    } ;

    public static void main(String args[])
    {
        P1 p = new P1 ();

        y.pro();
    }
}

// D:\javaprac\49_inner_classes>javac P1.java

// D:\javaprac\49_inner_classes>java P1
// namaste