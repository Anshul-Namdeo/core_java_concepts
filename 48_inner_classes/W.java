class W 
{
    int a = 7 ;

    class H 
    {
        int a = 21;

        void pro()
        {
            System.out.println(a);
        }
    }

    public static void main(String args[])
    {
        W v = new W();

        H h = v.new H();

        h.pro();
    }
}


// D:\javaprac\48_inner_classes>javac W.java

// D:\javaprac\48_inner_classes>java W
// 21
