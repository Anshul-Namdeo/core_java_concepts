class KK 
{
    //int g = 999;
    void info()
    {
        System.out.println("YYY");
    }
}

class U1 
{
    private int y = 222;

    KK j = new KK () {
        private int g = 200;
        public void info()
        {
            System.out.println(y);
        }
    } ;

    public static void main(String args[])
    {
        U1 t = new U1();

        t.j.info();

        System.out.println(t.j.g);
    }
}

// D:\javaprac\49_inner_classes>javac U1.java
// U1.java:28: error: cannot find symbol
//         System.out.println(t.j.g);
//                               ^
//   symbol:   variable g
//   location: variable j of type KK
// 1 error