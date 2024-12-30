class N 
{
    public static void main(String[] args) {
        
        aaa();
    }

    static void aaa()
    {
        bbb();
    }

    static void bbb()
    {
        ccc();
    }

    static void ccc()
    {
        int x = 12/0;
    }
}
// D:\javaprac\32_exception_handling>javac N.java

// D:\javaprac\32_exception_handling>java N
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at N.ccc(N.java:20)
//         at N.bbb(N.java:15)
//         at N.aaa(N.java:10)
//         at N.main(N.java:5)