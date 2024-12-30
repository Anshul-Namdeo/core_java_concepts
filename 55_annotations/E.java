class E 
{
    void process()
    {
        Integer x1 = new Integer(12);
        System.out.println(x1);

        // some more code..

        Integer x2 = new Integer(24);
        System.out.println(x2);
    }
}

// D:\javaprac\55_annotations>javac E.java
// E.java:5: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer x1 = new Integer(12);
//                      ^
// E.java:10: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer x2 = new Integer(24);
//                      ^
// 2 warnings
