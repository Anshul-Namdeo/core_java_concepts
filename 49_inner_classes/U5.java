class KK 
{
    int g = 999;
    void info()
    {
        System.out.println("YYY");
    }
}

class U5
{
    private int y = 222;

   static KK j = new KK () {
        private static int g = 200;
        // public void info()
        // {
        //     System.out.println(y);
        // }
    } ;

    public static void main(String args[])
    {
       System.out.println(U5.j.g);
    }
}


// D:\javaprac\49_inner_classes>javac U5.java

// D:\javaprac\49_inner_classes>java U5
// 999