class I4 
{
    public static void main(String[] args) {
        
        System.out.println("~~~~~~~~~~~~1");

        try
        {
            int i = Integer.parseInt(args[0]);
            System.out.println("~~~~~~~~~~2");

            int[] x = {3,0,2};
            int n = x[i];
            System.out.println("~~~~~~~~~~~3");
            System.out.println(n);

            int z = 12/n;
            System.out.println("~~~~~~~~~~~4");
            System.out.println(z);
        }catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("~~~~~~~~~~~~~5");
    }
}

// D:\javaprac\32_exception_handling>javac I4.java

// D:\javaprac\32_exception_handling>java I4 0
// ~~~~~~~~~~~~1
// ~~~~~~~~~~2
// ~~~~~~~~~~~3
// 3
// ~~~~~~~~~~~4
// 4
// ~~~~~~~~~~~~~5