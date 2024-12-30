class X 
{
    void process() 
    {
        System.out.println("hello");
    }
}

class A extends X 
{
    void proces()
    {
        System.out.println("hi");
    }

    public static void main(String args[])
    {
        X x = new A();

        x.process();
    }
}

// D:\javaprac\55_annotations>javac A.java

// D:\javaprac\55_annotations>java A
// hello