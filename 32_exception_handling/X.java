class X 
{
    public static void main(String args[])
    {
        try
        {
            int x = 12/0;
        }catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}

// D:\javaprac\32_exception_handling>javac X.java

// D:\javaprac\32_exception_handling>java X
// java.lang.ArithmeticException: / by zero
// / by zero