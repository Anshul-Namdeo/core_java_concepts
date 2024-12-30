class Z 
{
   static int a = 66;
    class A
    {
         int a = 55;
        class B 
        {
             int a = 44;
            class C 
            {
                 int a = 33;
                class D extends Z1 
                {
                     int a = 22;

                     void pro()
                    {
                         int a = 11;

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
    static int a = 5;
}


// D:\javaprac\49_inner_classes>javac B1.java

// D:\javaprac\49_inner_classes>java Z
// 11
// 22
// 33
// 44
// 55
// 66