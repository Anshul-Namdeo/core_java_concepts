class Z 
{
    class A 
    {
        class B 
        {
            class C 
            {
                class D 
                {
                    void pro()
                    {
                        System.out.println("hello");
                    }
                }
            }
        }
    }

    public static void main(String args[])
    {
        Z z = new Z();

        A a = z.new A();

        A.B b = a.new B();

        A.B.C c = b.new C();

        A.B.C.D d = c.new D();

        d.pro();
    }
}


// D:\javaprac\48_inner_classes>javac Z.java

// D:\javaprac\48_inner_classes>java Z
// hello