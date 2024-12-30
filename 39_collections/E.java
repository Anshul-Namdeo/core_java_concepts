import java.util.TreeSet;

class E 
{
    public static void main(String[] args) {
        
        TreeSet set = new TreeSet();

        set.add(56);
        set.add(23);
        set.add(41);
        set.add(19);
        set.add(4);

        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.size());
    }
}


// D:\javaprac\39_collections>javac E.java
// Note: E.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\39_collections>java E
// [4, 19, 23, 41, 56]
// false
// 5