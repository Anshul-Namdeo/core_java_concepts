class P 
{
    public static void main(String args[])
    {
      //  pro(12);
      //  pro(12.3f);
          pro(5.7);
    }

    static void pro(int x)
    {
        System.out.println(x + "-------####");
    }

    static void pro(float x)
    {
        System.out.println(x + "####---###");
    }

    static void pro(double x)
    {
        System.out.println(x + "-------####---------");
    }

}



// D:\javaprac\42_generics>javac P.java

// D:\javaprac\42_generics>java P
// 12-------####

// D:\javaprac\42_generics>javac P.java

// D:\javaprac\42_generics>java P
// 12.3####---###

// D:\javaprac\42_generics>javac P.java

// D:\javaprac\42_generics>java P
// 5.7-------####---------
