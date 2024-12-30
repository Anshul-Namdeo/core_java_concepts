class P 
{
    private int y = 2222;

    void info()
    {
        System.out.println(y);
    }

    class R 
    {
        private void pro() 
        {
            System.out.println( " pro()" + y);
        }
    }

    public static void main(String args[])
    {
        P x = new P();
        R r = x.new R();

        r.pro();
    }
}

// D:\javaprac\48_inner_classes>javac P.java

// D:\javaprac\48_inner_classes>java P
//  pro()2222
