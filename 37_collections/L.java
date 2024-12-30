import java.util.ArrayList;

class L 
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

        // System.out.println(x.remove(3));
        System.out.println(x.get(3));

        System.out.println(x);
    }
}


// D:\javaprac\37_collections>javac L.java
// Note: L.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\37_collections>java L
// [5, 2, 3, 5, 9]
// 5
// [5, 2, 3, 5, 9]