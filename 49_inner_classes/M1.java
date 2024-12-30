class M1 
{
    int e = 39;

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
        M1 l = new M1 ();
        l.pro();
    }
}

// D:\javaprac\49_inner_classes>javac M1.java

// D:\javaprac\49_inner_classes>java M1
// 39
