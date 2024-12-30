class H1 
{
    class A 
    {
        A()
        {
            System.out.println("namaskaram");
        }
    }
}

class I 
{
    public static void main(String ... args)
    {
        H1 h = new H1();
        A x = h.new A();
    }
}

// D:\javaprac\48_inner_classes\I>javac I.java
// I.java:17: error: cannot find symbol
//         A x = h.new A();
//         ^
//   symbol:   class A
//   location: class I
// 1 error