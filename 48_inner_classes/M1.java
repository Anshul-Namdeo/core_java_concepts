class M1 
{
    int w = 22;

    {
        System.out.println("<int block> " + w);
    }

    void pro()
    {
        System.out.println("pro()" + w);
    }

    M1 ()
    {
        System.out.println("M1()" + w);
    }

    class N 
    {
        void info()
        {
        System.out.println("info()" + w);
        }
    }

    public static void main(String args[])
    {
        M1 x = new M1();

        N y = x.new N();

        y.info();
    }
}


// D:\javaprac\48_inner_classes>javac M1.java

// D:\javaprac\48_inner_classes>java M1
// <int block> 22
// M1()22
// info()22 