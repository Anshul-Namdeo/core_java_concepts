class F2
{
    int e = 88;

    void pro()
    {
        System.out.println("GoLU");
    }

    class Z 
    {
        Z()
        {
            System.out.println("Namste,,,");
        }
    }

    void Info()
    {
       new Z();
       this.new Z();
    }

    public static void main(String args[])
    {
        F2 f = new F2();
        f.Info();
    }
}

// D:\javaprac\48_inner_classes>javac F2.java

// D:\javaprac\48_inner_classes>java F2
// Namste,,,
// Namste,,,