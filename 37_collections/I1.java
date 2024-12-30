import java.util.ArrayList;

class I1 
{
    public static void main(String args[])
    {
        ArrayList x = new ArrayList();

        x.add(2.34);
        x.add(8.45);
        x.add(7.21);
        x.add(9.01);

        System.out.println(x);

        // x.add(20,5.55);
      x.set(20,5.55);

        System.out.println(x);
    }
}


// D:\javaprac\37_collections>javac I1.java
// Note: I1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\37_collections>java I1
// [2.34, 8.45, 7.21, 9.01]
// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 20 out of bounds for length 4
//         at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
//         at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
//         at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
//         at java.base/java.util.Objects.checkIndex(Objects.java:359)
//         at java.base/java.util.ArrayList.set(ArrayList.java:441)
//         at I1.main(I1.java:17)
