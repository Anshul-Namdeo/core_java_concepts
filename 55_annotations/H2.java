import java.util.ArrayList;

class H2
{
    @SuppressWarnings("unchecked")
    public static void main(String args[])
    {
        ArrayList x = new ArrayList();

        x.add(12);
        x.add(14);
        x.add(13);

        @SuppressWarnings("deprecation")
        Integer y = new Integer(78);

        // some more code..

         @SuppressWarnings("deprecation")
        Integer z = new Integer(789);
    }
}



// D:\javaprac\55_annotations>javac H2.java
// H2.java:15: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer y = new Integer(78);
//                     ^
// H2.java:20: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer z = new Integer(789);
//                     ^
// 2 warnings