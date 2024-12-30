import java.util.TreeSet;
import java.util.Iterator;

class G5 
{
    public static void main(String[] args) {
        
        TreeSet<String> set = new TreeSet<String> ();

        set.add("jay");
        set.add("mohan");
        set.add("bablu");
        set.add("rohan");
        set.add("ganesh");

        Iterator<String> itr = set.iterator();

        while(itr.hasNext())
        {
            // String str = (String) itr.next();
            System.out.println(itr.next().length());
        }
    }
}


// D:\javaprac\39_collections>javac G5.java

// D:\javaprac\39_collections>java G5
// 5
// 6
// 3
// 5
// 5