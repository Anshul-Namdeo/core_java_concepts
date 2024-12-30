class WWW 
{
    private static int w = 7777;

    static class A 
    {
        void pro()
        {
            System.out.println(w);
        }
    }
}

class Y1 
{
    public static void main(String args[])
    {
        //A a = new A();
        WWW.A a = new WWW.A();
        a.pro();
    }
}



// D:\javaprac\49_inner_classes>javac Y1.java

// D:\javaprac\49_inner_classes>java Y1
// 7777
