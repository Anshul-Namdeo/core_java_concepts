class Z 
{
   private int a = 66;
    class A
    {
        private int a = 55;
        class B 
        {
            private int a = 44;
            class C 
            {
                private int a = 33;
                class D extends Z1 
                {
                    private int a = 22;

                    private void pro()
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
    private int a = 5;
}



// D:\javaprac\49_inner_classes>javac B.java
// B.java:23: error: a has private access in Z1
//                         System.out.println(super.a);
//                                                 ^
// 1 error