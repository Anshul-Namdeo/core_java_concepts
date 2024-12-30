class Y 
{
    int a = 777;

    class H extends T 
    {
        int a = 333;

        void pro() 
        {
            int a = 888;

            System.out.println(a);
            System.out.println(this.a);
            System.out.println(super.a);
        }
    }

    public static void main(String [] args)
    {
        Y v = new Y();

        H h = v.new H();

        h.pro();
    }
}

class T 
{
    int a = 999;
}

// D:\javaprac\48_inner_classes>javac Y.java

// D:\javaprac\48_inner_classes>java Y
// 888
// 333
// 999