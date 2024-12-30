class J4 
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


// D:\javaprac\32_exception_handling>javac J4.java

// D:\javaprac\32_exception_handling>java J4
// ~~~~~~~~~1
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//         at J4.main(J4.java:9)
