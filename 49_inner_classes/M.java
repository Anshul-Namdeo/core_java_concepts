class M 
{
    static int e = 453;

    void pro()
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
        M m = new M();
        m.pro();
    }
}


// D:\javaprac\49_inner_classes>javac M.java

// D:\javaprac\49_inner_classes>java M
// 453