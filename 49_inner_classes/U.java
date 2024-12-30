class KK 
{
    int g = 999;
    void info()
    {
        System.out.println("YYY");
    }
}

class U 
{
    private int y = 222;

    KK j = new KK () {
        public void info()
        {
            System.out.println(y);
        }
    } ;

    public static void main(String args[])
    {
        U t = new U();

        t.j.info();
    }
}

// D:\javaprac\49_inner_classes>javac U.java

// D:\javaprac\49_inner_classes>java U
// 222