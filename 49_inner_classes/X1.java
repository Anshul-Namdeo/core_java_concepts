class X1 
{
    private static int w = 78;

    static class A 
    {
        private void pro()
        {
            System.out.println(w);
        }
    }

    public static void main(String args[])
    {
        A a = new A();

        a.pro();
    }
}

// D:\javaprac\49_inner_classes>javac X1.java

// D:\javaprac\49_inner_classes>java X1
// 78

// NOTE : outer class ke private member ko hum nested class mai baith ke access karna chahete hai to hame outer class ke member ko static mark karna padehga..