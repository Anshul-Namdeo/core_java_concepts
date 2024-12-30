class X1 
{
    void process()
    {
        System.out.println("hello");
    }
}

class A1 extends X1 
{
    @Override
    void proces() 
    {
        System.out.println("hi");
    }

    public static void main(String args[])
    {
        X1 x = new A1();

        x.process();
    }
}

// D:\javaprac\55_annotations>javac A1.java
// A1.java:11: error: method does not override or implement a method from a supertype
//     @Override
//     ^
// 1 error