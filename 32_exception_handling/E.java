class E 
{
    public static void main(String[] args) {
     
        System.out.println(1);

        try
        {
            int x = 1/0;
        }
        catch(ArithmeticException e)
        {
           System.out.println("problem solved ");
        }

        System.out.println(3);
    }
}


// D:\javaprac\32_exception_handling>javac E.java

// D:\javaprac\32_exception_handling>java E
// 1
// problem solved
// 3
