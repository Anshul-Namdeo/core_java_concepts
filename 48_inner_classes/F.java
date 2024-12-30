class F 
{
    int e = 88;

    void pro()
    {
        System.out.println("GoLU");
    }

    class Z 
    {

    }

    void Info()
    {
        System.out.println(e);
        System.out.println(this.e);
    }

    public static void main(String args[])
    {
        F f = new F();
        f.Info();
    }
}

// D:\javaprac\48_inner_classes>javac F.java

// D:\javaprac\48_inner_classes>java F
// 88
// 88