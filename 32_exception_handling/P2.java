public class P2
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
          // System.out.println("-----Essential code ---------");
       }
    //    catch(ArithmeticException e)
    //    {
    //        System.out.println(e + "AE");
    //        System.out.println("-----Essential code ---------");
    //    }
       catch(NumberFormatException e)
       {
            System.out.println(e + "NFE");
           // System.out.println("-----Essential code ---------");
       }
       finally
       {
        System.out.println("-----Essential code ---------");
       }

       System.out.println("~~~~~~~~5");
   }
} 


// D:\javaprac\32_exception_handling>javac P2.java

// D:\javaprac\32_exception_handling>java P2 1
// ~~~~~~~1
// ~~~~~~~2
// ~~~~~~3
// 0
// -----Essential code ---------
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at P2.main(P2.java:17)