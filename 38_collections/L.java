import java.util.HashSet;

class L 
{
    public static void main(String args[])
    {
        HashSet set = new HashSet();

        System.out.println(set);

        set.add(56);
        set.add(12);
        set.add(78);
        set.add(69);
        set.add(56);
        set.add(85);
        set.add(56);

        System.out.println(set);
    }
}


// D:\javaprac\38_collections>javac L.java
// Note: L.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\38_collections>java L
// []
// [69, 85, 56, 12, 78]