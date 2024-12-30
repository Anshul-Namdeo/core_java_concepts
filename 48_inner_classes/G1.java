class Y2 
{
    int r = 122;

    void pro()
    {
        System.out.println("yamraj");
    }

    class E 
    {
        E()
        {
            System.out.println("-----%%%------");
        }
    }
}

class G1 
{
    void info() 
    {
       Y2 z = new Y2();

        System.out.println(z.r);

        z.pro();

        z.new E();
    }

    public static void main(String ... args)
    {
        G1 v = new G1();
        v.info();
    }
}

// D:\javaprac\48_inner_classes>javac G1.java

// D:\javaprac\48_inner_classes>java G1
// 122
// yamraj
// -----%%%------