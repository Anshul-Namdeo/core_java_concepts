public class O3
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
    

// D:\javaprac\32_exception_handling>javac O3.java

// D:\javaprac\32_exception_handling>java O3 2
// ~~~~~~~1
// ~~~~~~~2
// ~~~~~~3
// 2
// ~~~~~~4
// 6
// -----Essential code ---------
// ~~~~~~~~5