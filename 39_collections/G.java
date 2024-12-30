import java.util.TreeSet;

class G 
{
    public static void main(String[] args) {
        
        TreeSet set = new TreeSet();

        
        set.add(56);
        set.add(23);
        set.add(41);
        set.add(19);
        set.add(4);
        set.add(38);
        set.add(9);

        for(Object y : set )
        {
            System.out.println(y + " - ");
        }
    }
}


// D:\javaprac\39_collections>javac G.java
// Note: G.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\39_collections>java G
// 4 -
// 9 -
// 19 -
// 23 -
// 38 -
// 41 -
56 -