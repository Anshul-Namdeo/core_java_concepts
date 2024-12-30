class X2 
{
    void process ()
    {
        System.out.println("hello");
    }
}

class A2 extends X2 
{
    @Override
    void process()
    {
        System.out.println("hi");
    }

    public static void main(String args[])
    {
        X2 x = new A2();

        x.process();
    }
}

// D:\javaprac\55_annotations>javac A2.java

// D:\javaprac\55_annotations>java A2
// hi