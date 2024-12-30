import java.util.ArrayList;

class Y1 
{
    public static void main(String args[])
    {
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add("ganesh");
        x.add("vikram");
        x.add("raj");
        x.add("swaraj");

        System.out.println(x);

        int size = x.size();

        for(int i=0; i<size; i++)
        {
            System.out.println(x.remove(i));
        }

        System.out.println(x);
    }
}


// D:\javaprac\37_collections>javac Y1.java
// Note: Y1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\37_collections>java Y1
// [mohan, ganesh, vikram, raj, swaraj]
// mohan
// vikram
// swaraj
// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 2
//         at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
//         at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
//         at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
//         at java.base/java.util.Objects.checkIndex(Objects.java:359)
//         at java.base/java.util.ArrayList.remove(ArrayList.java:504)
//         at Y1.main(Y1.java:21)
