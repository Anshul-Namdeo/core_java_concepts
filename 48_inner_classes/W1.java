class W1
{
    int a = 7 ;

    class H 
    {
        // int a = 21;

        void pro()
        {
            System.out.println(a);
        }
    }

    public static void main(String args[])
    {
        W1 v = new W1();

        H h = v.new H();

        h.pro();
    }
}

// D:\javaprac\48_inner_classes>javac W1.java

// D:\javaprac\48_inner_classes>java W1
// 7
