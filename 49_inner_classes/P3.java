abstract class H1 
{
    abstract void pro() ;
}

class P3
{
      H1 y = new H1 () {
        void pro()
        {
            System.out.println("namaste");
        }
    } ;

    public static void main(String args[])
    {
        P3 p = new P3 ();

        p.y.pro();
    }
}

// D:\javaprac\49_inner_classes>javac P3.java

// D:\javaprac\49_inner_classes>java P3
// namaste
