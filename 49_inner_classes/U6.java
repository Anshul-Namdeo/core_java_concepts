class KK 
{
    int g = 999;
    void info()
    {
        System.out.println("YYY");
    }
}

class U6
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
       System.out.println(g);
    }
}


// D:\javaprac\49_inner_classes>javac U6.java
// U6.java:24: error: cannot find symbol
//        System.out.println(g);
//                           ^
//   symbol:   variable g
//   location: class U6
// 1 error