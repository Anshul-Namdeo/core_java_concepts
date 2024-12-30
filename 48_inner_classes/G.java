class Y1 
{
    int r = 78;

    void pro()
    {
        System.out.println("yam");
    }

    class E 
    {
        E()
        {
            System.out.println("--------------");
        }
    }
}

class G 
{
    public static void main(String ... args)
    {
        Y1 z = new Y1();

        System.out.println(z.r);

        z.pro();

        z.new E();
    }
}


// D:\javaprac\48_inner_classes>javac G.java

// D:\javaprac\48_inner_classes>java G
// 78
// yam
// --------------