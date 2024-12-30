import java.util.HashSet;

class M 
{
    public static void main(String args[])
    {
        HashSet set = new HashSet();    

        set.add(56);
        set.add(12);
        set.add(78);
        set.add(69);
        set.add(85);

        // System.out.println(set.contains(13));
        System.out.println(set.contains(12));
      
    }
}


// D:\javaprac\38_collections>javac M.java
// Note: M.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\38_collections>java M
// true