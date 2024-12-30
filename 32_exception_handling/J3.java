class J3 
{
    public static void main(String[] args) 
    {
        System.out.println("~~~~~~~~~1");

        try
        {
            int i = Integer.parseInt(args[0]);
            System.out.println("~~~~~~~~~2");
        } 
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }

        System.out.println("~~~~~~~~~~~~3");
    }
}

// D:\javaprac\32_exception_handling>javac J3.java

// D:\javaprac\32_exception_handling>java J3 two
// ~~~~~~~~~1
// java.lang.NumberFormatException: For input string: "two"
// ~~~~~~~~~~~~3