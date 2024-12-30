interface LL 
{
    void info();
}

class S1 
{
    static int y = 222;

    static LL j = new LL () {
        public void info()
        {
            System.out.println(y);
        }
    } ;

    public static void main(String args[])
    {
        S1.j.info();
    }
}

// D:\javaprac\49_inner_classes>java S1
// 222