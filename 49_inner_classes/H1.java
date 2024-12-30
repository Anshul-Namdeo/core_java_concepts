class H1 
{
    int y = 90;

    void pro()
    {
        class U 
        {
            void info() 
            {
                System.out.println(y);
            }
        }

        U u = new U();
        u.info();
    }

    public static void main(String args[])
    {
        H1 h =  new H1();
        h.pro();
    }
}


// D:\javaprac\49_inner_classes>javac H1.java

// D:\javaprac\49_inner_classes>java H1
// 90
