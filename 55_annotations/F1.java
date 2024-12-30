class F1 
{
    @SuppressWarnings("deprecation")
    void pro()
    {
        Integer x = new Integer(12);
        System.out.println(x);
    }

    @SuppressWarnings("deprecation")
    void info()
    {
        Integer y = new Integer(13);
        System.out.println(y);
    }
}

// D:\javaprac\55_annotations>javac F1.java
// F1.java:6: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer x = new Integer(12);
//                     ^
// F1.java:13: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer y = new Integer(13);
//                     ^
// 2 warnings