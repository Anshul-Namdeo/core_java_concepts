import java.util.TreeSet;

class D 
{
    public static void main(String args[])
    {
        TreeSet set = new TreeSet();

        set.add(56);
        set.add(23);
        set.add(41);
        set.add(19);
        set.add(4);

        System.out.println(set);
    }
}


// D:\javaprac\39_collections>javac D.java
// Note: D.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\39_collections>java D
// [4, 19, 23, 41, 56]
