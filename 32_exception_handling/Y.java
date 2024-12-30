class Y 
{
    public static void main (String args[])
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
        try
        {
            int x = 12/0;
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
        
        System.out.println("Y");
    }
    }

//     D:\javaprac\32_exception_handling>javac Y.java

// D:\javaprac\32_exception_handling>java Y
// G
// A
// W
// java.lang.ArithmeticException: / by zero
//         at Y.ccc(Y.java:28)
//         at Y.bbb(Y.java:20)
//         at Y.aaa(Y.java:13)
//         at Y.main(Y.java:6)
// Y
// N
// J
// D
