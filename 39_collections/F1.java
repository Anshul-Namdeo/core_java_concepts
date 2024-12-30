import java.util.TreeSet;

class F1
{
    public static void main(String[] args) {
        
        TreeSet set = new TreeSet();

        set.add(56);
        set.add(23);
        set.add(41);
        set.add(19);
        set.add(4);

        System.out.println(set);
        System.out.println(set.remove(41));
        System.out.println(set);
    }
}

// Note: F1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\39_collections>java F1
// [4, 19, 23, 41, 56]
// true
// [4, 19, 23, 56]
