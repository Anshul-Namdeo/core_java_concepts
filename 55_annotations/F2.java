@SuppressWarnings("deprecation")

class F1 
{
    // @SuppressWarnings("deprecation")
    void pro()
    {
        Integer x = new Integer(12);
        System.out.println(x);
    }

    // @SuppressWarnings("deprecation")
    void info()
    {
        Integer y = new Integer(13);
        System.out.println(y);
    }
}


// D:\javaprac\55_annotations>javac F2.java
// F2.java:8: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer x = new Integer(12);
//                     ^
// F2.java:15: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer y = new Integer(13);
//                     ^
// 2 warnings
