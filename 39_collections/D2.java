import java.util.TreeSet;

class D2 
{
    public static void main(String[] args) {
        
        TreeSet set = new TreeSet();

        set.add(" a");
        set.add("1j");
        set.add(" M");
        set.add("U2");
        set.add("5H");

        System.out.println(set);
    }
}


// D:\javaprac\39_collections>javac D2.java
// Note: D2.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\39_collections>java D2
// [ M,  a, 1j, 5H, U2]
