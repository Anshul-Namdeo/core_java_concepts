class X1 
{
    int a = 777;

    class H extends Y3
    {
        // int a = 333;

        void pro()
        {
            System.out.println(a);
        }
    }

    public static void main(String args[])
    {
        X1 x = new X1();

        H h = x.new H();

        h.pro();
    }
}

class Y3 
{
    int a = 999;
}

// D:\javaprac\48_inner_classes>javac X1.java

// D:\javaprac\48_inner_classes>java X1
// 999
