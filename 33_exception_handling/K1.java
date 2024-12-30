class K1
{
    public static void main(String[] args) {
        
        System.out.println("T");
        aaa();
        System.out.println("H");
    }

    static void aaa()
    {
        System.out.println("S");
        bbb();
        System.out.println("J");
    }

    static void bbb()
    {
        System.out.println("K");
        ccc();
        System.out.println("Q");
    }

    static void ccc() throws ArithmeticException
    {
        int x = 12/0;
        System.out.println("R");
    }
}

// D:\javaprac\33_exception_handling>javac K1.java

// D:\javaprac\33_exception_handling>java K1
// T
// S
// K
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at K1.ccc(K1.java:26)
//         at K1.bbb(K1.java:20)
//         at K1.aaa(K1.java:13)
//         at K1.main(K1.java:6)

