class M1
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
       catch(ArrayIndexOutOfBoundsException |ArithmeticException|NumberFormatException e)
       {
           System.out.println(e);
           System.out.println(" solution step 1");
           System.out.println(" solution step 2");
           System.out.println(" solution step 3");
       }
    //    catch(ArithmeticException e)
    //    {
    //        System.out.println(" AE");
    //        System.out.println(" solution step 1");
    //        System.out.println(" solution step 2");
    //        System.out.println(" solution step 3");
    //    }
    //    catch(NumberFormatException e)
    //    {
    //         System.out.println(" NFE");
    //         System.out.println(" solution step 1");
    //         System.out.println(" solution step 2");
    //         System.out.println(" solution step 3");
    //    }

       System.out.println("~~~~~~~~5");
   }
}

// D:\javaprac\32_exception_handling>javac M1.java

// D:\javaprac\32_exception_handling>java M1 a
// ~~~~~~~1
// java.lang.NumberFormatException: For input string: "a"
//  solution step 1
//  solution step 2
//  solution step 3
// ~~~~~~~~5
