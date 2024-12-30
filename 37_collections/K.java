import java.util.ArrayList;

class K 
{
    public static void main(String args[])
    {
        ArrayList x = new ArrayList();

        x.add(5);
        x.add(2);
        x.add(3);
        x.add(5);
        x.add(9);

        System.out.println(x);

        System.out.println(x.remove(9));

        System.out.println(x);

    }
}

// D:\javaprac\37_collections>javac K.java
// Note: K.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\37_collections>java K
// [5, 2, 3, 5, 9]
// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 9 out of bounds for length 5
//         at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
//         at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
//         at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
//         at java.base/java.util.Objects.checkIndex(Objects.java:359)
//         at java.base/java.util.ArrayList.remove(ArrayList.java:504)
//         at K.main(K.java:17)