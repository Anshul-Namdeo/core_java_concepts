class E1 
{
    void process()
    {
        @SuppressWarnings("deprecation")
        Integer x1 = new Integer(12);
        System.out.println(x1);

        // some more code..

        @SuppressWarnings("deprecation")
        Integer x2 = new Integer(24);
        System.out.println(x2);
    }
}

// D:\javaprac\55_annotations>javac E1.java
// E1.java:6: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer x1 = new Integer(12);
//                      ^
// E1.java:12: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer x2 = new Integer(24);
//                      ^
// 2 warnings