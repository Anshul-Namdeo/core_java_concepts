class Z 
{
    int a = 666;
    class A
    {
        int a = 555;
        class B 
        {
            int a = 444;
            class C 
            {
                int a = 333;
                class D extends Z1 
                {
                    int a = 222;

                    void pro()
                    {
                        int a = 111;

                        System.out.println(a);
                        System.out.println(this.a);
                        System.out.println(super.a);
                        System.out.println(C.this.a);
                        System.out.println(B.this.a);
                        System.out.println(A.this.a);
                        System.out.println(Z.this.a);
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

class Z1 
{
    int a = 1111;
}


// D:\javaprac\49_inner_classes>javac A.java

// D:\javaprac\49_inner_classes>java Z
// 111
// 222
// 1111
// 333
// 444
// 555
// 666