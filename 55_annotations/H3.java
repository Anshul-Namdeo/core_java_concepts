import java.util.ArrayList;

class H3
{
     @SuppressWarnings("deprecation")
    @SuppressWarnings("unchecked")
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


// D:\javaprac\55_annotations>javac H3.java
// H3.java:6: error: SuppressWarnings is not a repeatable annotation type
//     @SuppressWarnings("unchecked")
//     ^
// H3.java:16: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer y = new Integer(78);
//                     ^
// H3.java:21: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer z = new Integer(789);
//                     ^
// Note: H3.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error
// 2 warnings