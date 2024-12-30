class W 
{
    static int y = 11;

    static void pro()
    {
        System.out.println("hello");
    }

     // Nested class
    static class A 
    {
        A()
        {
            System.out.println("hi");
        }
    }

    public static void main(String args[])
    {
        System.out.println(y);
        pro();

        A a = new A();
    }
}


// D:\javaprac\49_inner_classes>javac W.java

// D:\javaprac\49_inner_classes>java W
// 11
// hello
// hi