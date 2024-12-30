class X 
{
    private /*static*/ int w = 78;

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

// D:\javaprac\49_inner_classes>javac X.java
// X.java:9: error: non-static variable w cannot be referenced from a static context
//             System.out.println(w);
//                                ^
// 1 error