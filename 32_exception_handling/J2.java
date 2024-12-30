class J2 
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

// D:\javaprac\32_exception_handling>javac J2.java

// D:\javaprac\32_exception_handling>java J2 -22
// ~~~~~~~~~1
// ~~~~~~~~~2
// ~~~~~~~~~~~~3