class K5 
{
   public static void main(String[] args) 
   {
       System.out.println("~~~~~~~1");
       
       try
       {
           int i = Integer.parseInt(args[0]);
           System.out.println("~~~~~~~2");

           int[] x = {3,0,2};
           int n = x[i];
           System.out.println("~~~~~~3");
           System.out.println(n);

           int z=12/n;
           System.out.println("~~~~~~4");
           System.out.println(z);
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
           System.out.println(e + "AIOBS");
       }
       catch(ArithmeticException e)
       {
           System.out.println(e + "AE");
       }
       catch(NumberFormatException e)
       {
            System.out.println(e + "NFE");
       }

       System.out.println("~~~~~~~~5");
   }
}


// D:\javaprac\32_exception_handling>javac K5.java

// D:\javaprac\32_exception_handling>java K5 3
// ~~~~~~~1
// ~~~~~~~2
// java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3AIOBS
// ~~~~~~~~5