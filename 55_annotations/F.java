class F 
{
    void pro()
    {
        @SuppressWarnings("deprecation")
        Integer x = new Integer(12);
        System.out.println(x);
    }

    void info()
    {
        @SuppressWarnings("deprecation")
        Integer y = new Integer(13);
        System.out.println(y);
    }
}


// D:\javaprac\55_annotations>javac F.java
// F.java:6: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer x = new Integer(12);
//                     ^
// F.java:13: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer y = new Integer(13);
//                     ^
// 2 warnings