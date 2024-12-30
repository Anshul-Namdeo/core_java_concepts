class KK 
{
    int g = 999;
    void info()
    {
        System.out.println("YYY");
    }
}

class U2 
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
        U2 t = new U2();

        t.j.info();

        System.out.println(t.j.g);
    }
}

// D:\javaprac\49_inner_classes>javac U2.java

// D:\javaprac\49_inner_classes>java U2
// 222
// 999



// NOTE : outer class mai baith ke inner class ke (private) variable ko access nhi kar skate hai...