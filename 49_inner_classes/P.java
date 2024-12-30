abstract class H1 
{
    abstract void pro() ;
}

class P 
{
    H1 y = new H1 () {
        void pro()
        {
            System.out.println("namaste");
        }
    } ;

    public static void main(String args[])
    {
        P p = new P ();

        y.pro();
    }
}

// D:\javaprac\49_inner_classes>javac P.java
// P.java:19: error: non-static variable y cannot be referenced from a static context
//         y.pro();
//         ^
// 1 error