import java.util.ArrayList;

class H4
{
     
    @SuppressWarnings({"deprecation", "unchecked"})
    public static void main(String args[])
    {
        ArrayList x = new ArrayList();

        x.add(12);
        x.add(14);
        x.add(13);

        // @SuppressWarnings("deprecation")
        Integer y = new Integer(78);

        // some more code..

        //  @SuppressWarnings("deprecation")
        Integer z = new Integer(789);
    }
}

// D:\javaprac\55_annotations>javac H4.java
// H4.java:16: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer y = new Integer(78);
//                     ^
// H4.java:21: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer z = new Integer(789);
//                     ^
// 2 warnings
