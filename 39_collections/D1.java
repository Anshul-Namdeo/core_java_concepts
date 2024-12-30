import java.util.TreeSet;

class D1 
{
   public static void main(String[] args) {
    
        TreeSet set = new TreeSet();
        
        set.add("jay");
        set.add("mohan");
        set.add("bablu");
        set.add("rohan");
        set.add("ganesh");

        System.out.println (set);
   }
    
}


// D:\javaprac\39_collections>javac D1.java
// Note: D1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\39_collections>java D1
// [bablu, ganesh, jay, mohan, rohan]
