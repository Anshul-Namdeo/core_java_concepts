class E1 
{
     @SuppressWarnings("deprecation")
    void process()
    {
        // @SuppressWarnings("deprecation")
        Integer x1 = new Integer(12);
        System.out.println(x1);

        // some more code..

        // @SuppressWarnings("deprecation")
        Integer x2 = new Integer(24);
        System.out.println(x2);
    }
}


// D:\javaprac\55_annotations>javac E2.java
// E2.java:7: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer x1 = new Integer(12);
//                      ^
// E2.java:13: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer x2 = new Integer(24);
//                      ^
// 2 warnings
