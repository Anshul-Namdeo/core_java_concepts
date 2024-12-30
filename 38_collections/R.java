import java.util.HashSet;

class R 
{
    public static void main(String args[])
    {
        HashSet set = new HashSet();

        set.add("mobha");
        set.add(12);
        set.add(true);
        set.add(4.56);

        System.out.println(set);
    }
}


// D:\javaprac\38_collections>javac R.java
// Note: R.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\38_collections>java R
// [4.56, mobha, 12, true]
