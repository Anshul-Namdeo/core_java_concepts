class O 
{
    private int y = 111;

    void info()
    {
        System.out.println(y);
    }

    O()
    {
        System.out.println(  " O()" + y);
    }

    {
        System.out.println( " <int block> " + y);
    }

    class R 
    {
        void pro()
        {
            System.out.println( "pro()" + y);
        }
    }

    public static void main(String args[])
    {
        O x = new O();
        R r = x.new R();

        r.pro();
    }
}


// D:\javaprac\48_inner_classes>javac O.java

// D:\javaprac\48_inner_classes>java O
//  <int block> 111
//  O()111
// pro()111

// Note : hum inner class mai se outer class ke private member ko access kar sakte hai.