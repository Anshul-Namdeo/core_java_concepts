public class O12
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

           System.out.println("-----Essential code ---------");
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
           System.out.println(e + "AIOBS");
           System.out.println("-----Essential code ---------");
       }
       catch(ArithmeticException e)
       {
           System.out.println(e + "AE");
           System.out.println("-----Essential code ---------");
       }
       catch(NumberFormatException e)
       {
            System.out.println(e + "NFE");
            System.out.println("-----Essential code ---------");
       }

       System.out.println("~~~~~~~~5");
   }
} 


// D:\javaprac\32_exception_handling>javac O12.java

// D:\javaprac\32_exception_handling>java O12 a
// ~~~~~~~1
// java.lang.NumberFormatException: For input string: "a"NFE
// -----Essential code ---------
// ~~~~~~~~5