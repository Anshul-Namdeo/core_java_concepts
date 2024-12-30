import java.util.HashSet;


class N 
{
    public static void main(String args[])
    {
        HashSet set = new HashSet();

        set.add(56);
        set.add(12);
        set.add(78);
        set.add(69);
        set.add(85);

        System.out.println(set);

        // System.out.println(set.remove(12));
        System.out.println(set.remove(99));

        System.out.println(set);
       
    }
}


// D:\javaprac\38_collections>javac N.java
// Note: N.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\38_collections>java N
// [69, 85, 56, 12, 78]
// false
// [69, 85, 56, 12, 78]