class V 
{
    public static void main(String args[])
    {
        System.out.println("G");
        aaa();
        System.out.println("D");
    }

    static void aaa()
    {
        System.out.println("A");
        bbb();
        System.out.println("J");
    }

    static void bbb()
    {
        System.out.println("W");
        ccc();
        System.out.println("N");
    }

    static void ccc()
    {
        int x = 12/0;
        System.out.println("Y");
    }
 }

// D:\javaprac\32_exception_handling>javac V.java

// D:\javaprac\32_exception_handling>java V
// G
// A
// W
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at V.ccc(V.java:26)
//         at V.bbb(V.java:20)
//         at V.aaa(V.java:13)
//         at V.main(V.java:6)
