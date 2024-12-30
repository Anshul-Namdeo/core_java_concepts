class W 
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
       
        try
        {
            bbb();
        }catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception ");
        }
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

//     D:\javaprac\32_exception_handling>java W
// G
// A
// W
// Arithmetic Exception
// J
// D
