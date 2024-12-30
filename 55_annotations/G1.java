 @SuppressWarnings("deprecation")
class G 
{
   
    {
        Integer x = new Integer(12);
        System.out.println(x);
    }


    
    static{
        Integer x = new Integer(6);
        System.out.println(x);
    }

    @SuppressWarnings("deprecation")
    void pro()
    {
        Integer x = new Integer(12);
        System.out.println(x);
    }

    @SuppressWarnings("deprecation")
    static void pro()
    {
        Integer x = new Integer(12);
        System.out.println(x);
    }

 
 @SuppressWarnings("deprecation")
    G()
    {
        Integer x = new Integer(12);
        System.out.println(x);
    }
}


// D:\javaprac\55_annotations>javac G1.java
// G1.java:25: error: method pro() is already defined in class G
//     static void pro()
//                 ^
// G1.java:6: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer x = new Integer(12);
//                     ^
// G1.java:13: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer x = new Integer(6);
//                     ^
// G1.java:20: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer x = new Integer(12);
//                     ^
// G1.java:27: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer x = new Integer(12);
//                     ^
// G1.java:35: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer x = new Integer(12);
//                     ^
// 1 error
// 5 warnings