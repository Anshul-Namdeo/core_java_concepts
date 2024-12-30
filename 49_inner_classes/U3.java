class KK 
{
    int g = 999;
    void info()
    {
        System.out.println("YYY");
    }
}

class U3 
{
    private int y = 222;

   static KK j = new KK () {
        private int g = 200;
        public static void info()
        {
            System.out.println(y);
        }
    } ;

    public static void main(String args[])
    {
       j.info();
    }
}


// D:\javaprac\49_inner_classes>javac U3.java
// U3.java:16: error: info() in <anonymous U3$1> cannot override info() in KK
//         public static void info()
//                            ^
//   overriding method is static
// U3.java:18: error: non-static variable y cannot be referenced from a static context
//             System.out.println(y);
//                                ^
// 2 errors