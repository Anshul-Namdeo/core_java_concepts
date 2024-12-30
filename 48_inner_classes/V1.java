class V1 
{
    int a = 9;

    class H 
    {
        // int a = 11;
    }

    public static void main(String args[])
    {
        V1 v = new V1();

        H h = v.new H ();

        System.out.println(h.a);
    }
}

// D:\javaprac\48_inner_classes>javac V1.java
// V1.java:16: error: cannot find symbol
//         System.out.println(h.a);
//                             ^
//   symbol:   variable a
//   location: variable h of type V1.H
// 1 error
