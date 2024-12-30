class KK 
{
    int g = 999;
    void info()
    {
        System.out.println("YYY");
    }
}

class U4
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
       System.out.println(j.g);
    }
}

// D:\javaprac\49_inner_classes>javac U4.java

// D:\javaprac\49_inner_classes>java U4
// 999