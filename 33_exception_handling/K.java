class K 
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

    static void ccc()
    {
        int x = 12/0;
        System.out.println("R");
    }
}

// D:\javaprac\33_exception_handling>javac K.java

// D:\javaprac\33_exception_handling>java K
// T
// S
// K
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at K.ccc(K.java:26)
//         at K.bbb(K.java:20)
//         at K.aaa(K.java:13)
//         at K.main(K.java:6)
