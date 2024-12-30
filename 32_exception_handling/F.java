class F 
{
    public static void main(String[] args) {
     
          
        System.out.println(1);

        String x = null;

       try
       {
        System.out.println(x.length());
       }catch(NullPointerException e)
       {
        System.out.println("problem solved ");
       }

        System.out.println(3);

    }
}


// D:\javaprac\32_exception_handling>javac F.java

// D:\javaprac\32_exception_handling>java F
// 1
// problem solved
// 3