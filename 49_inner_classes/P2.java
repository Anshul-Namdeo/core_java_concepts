abstract class H1 
{
    abstract void pro() ;
}

class P2 
{
      H1 y = new H1 () {
        void pro()
        {
            System.out.println("namaste");
        }
    } ;

    public static void main(String args[])
    {
        P2 p = new P2 ();

        p.pro();
    }
}

// D:\javaprac\49_inner_classes>javac P2.java
// P2.java:19: error: cannot find symbol
//         p.pro();
//          ^
//   symbol:   method pro()
//   location: variable p of type P2
// 1 error

