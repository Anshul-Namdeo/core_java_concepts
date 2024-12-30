class F1
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
        pro();
        this.pro();
    }

    public static void main(String args[])
    {
        F1 f = new F1();
        f.Info();
    }
}

// D:\javaprac\48_inner_classes>javac F1.java

// D:\javaprac\48_inner_classes>java F1
// GoLU
// GoLU