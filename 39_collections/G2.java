import java.util.TreeSet;
import java.util.Iterator;

class G2 
{
    public static void main(String[] args) {
        
        TreeSet<Integer> set = new TreeSet<Integer> ();

        set.add(56);
        set.add(23);
        set.add(41);
        set.add(19);
        set.add(4);
        set.add(38);
        set.add(9);

        Iterator itr = set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}


// D:\javaprac\39_collections>javac G2.java

// D:\javaprac\39_collections>java G2
// 4
// 9
// 19
// 23
// 38
// 41
// 56
