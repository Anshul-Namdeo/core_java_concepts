class V 
{
    int a = 9;

    class H 
    {
        int a = 11;
    }

    public static void main(String args[])
    {
        V v = new V();

        H h = v.new H();

        System.out.println(h.a);
    }
}

// D:\javaprac\48_inner_classes>javac V.java

// D:\javaprac\48_inner_classes>java V
// 11
