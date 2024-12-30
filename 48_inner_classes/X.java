class X 
{
    int a = 777;

    class H extends Y2 
    {
        int a = 333;

        void pro()
        {
            System.out.println(a);
        }
    }

    public static void main(String args[])
    {
        X x = new X();

        H h = x.new H();

        h.pro();
    }
}

class Y2 
{
    int a = 999;
}

// D:\javaprac\48_inner_classes>javac X.java

// D:\javaprac\48_inner_classes>java X
// 333