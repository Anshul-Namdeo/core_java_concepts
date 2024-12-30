import java.util.ArrayList;

class H 
{
    public static void main(String args[])
    {
        ArrayList x = new ArrayList();

        x.add(12);
        x.add(14);
        x.add(13);

        Integer y = new Integer(78);
    }
}

// D:\javaprac\55_annotations>javac H.java
// H.java:13: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer y = new Integer(78);
//                     ^
// Note: H.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 warning