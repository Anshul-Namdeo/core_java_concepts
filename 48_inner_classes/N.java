class N 
{
    static int w = 333;

    static 
    {
        System.out.println("<int block>" + w);
    }

    static void pro()
    {
        System.out.println("pro()" + w );
    }

    N()
    {
        System.out.println(" N() " + w);
    }

    class D 
    {
        void info()
        {
            System.out.println(" info() " + w);
            pro();
        }
    }
    public static void main(String args[])
    {
        N x = new  N ();

        D y = x.new D();

        y.info();
    }
}


// D:\javaprac\48_inner_classes>javac N.java

// D:\javaprac\48_inner_classes>java N
// <int block>333
//  N() 333
//  info() 333
// pro()333


// Note : hum inner class mai se outer class ke static member ko access kar sakte hai.