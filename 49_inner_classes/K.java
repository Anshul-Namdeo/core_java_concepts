class K 
{
    private int z = 12;

    void pro()
    {
        class A 
        {
            private void info()
            {
                System.out.println(z);
            }
        }

        A a = new A();
        a.info();

    }

    public static void main(String args[])
    {
        K k = new K();
        k.pro();
    }
}

// D:\javaprac\49_inner_classes>javac K.java

// D:\javaprac\49_inner_classes>java K
// 12