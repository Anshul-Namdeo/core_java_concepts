import java.util.TreeSet;
import java.util.Iterator;

class G4 
{
    public static void main(String[] args) {
        
        TreeSet<String> set = new TreeSet<String> ();

        set.add("jay");
        set.add("mohan");
        set.add("bablu");
        set.add("rohan");
        set.add("ganesh");

        Iterator itr = set.iterator();

        while(itr.hasNext())
        {
            String str = (String) itr.next();
            System.out.println(str.length());
        }
    }
}


// D:\javaprac\39_collections>javac G4.java

// D:\javaprac\39_collections>java G4
// 5
// 6
// 3
// 5
// 5