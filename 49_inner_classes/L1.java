class L1 
{
    static int e = 112;

    static void pro()
    {
        class A 
        {
            void info()
            {
                System.out.println(e);
            }
        }

        A a = new A();
        a.info();
    }

    public static void main(String args[])
    {
        L1 l = new L1();
        l.pro();
    }
}



// D:\javaprac\49_inner_classes>javac L1.java

// D:\javaprac\49_inner_classes>java L1
// 112
