import java.util.HashSet;

class K 
{
    public static void main(String args[])
    {
        HashSet set = new HashSet();

        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set);


        set.add(56);
        set.add(12);
        set.add(78);
        set.add(69);

        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set);
    }
}


// D:\javaprac\38_collections>javac K.java
// Note: K.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\38_collections>java K
// 0
// true
// []
// 4
// false
// [69, 56, 12, 78]