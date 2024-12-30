import java.util.ArrayList;

class H1 
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
    }
}

// D:\javaprac\55_annotations>javac H1.java
// H1.java:15: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer y = new Integer(78);
//                     ^
// 1 warning
