import java.util.TreeSet;
import java.util.Iterator;

class G3 
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
            System.out.println(itr.next().length());
        }
    }
}


// D:\javaprac\39_collections>javac G3.java
// G3.java:20: error: cannot find symbol
//             System.out.println(itr.next().length());
//                                          ^
//   symbol:   method length()
//   location: class Object
// 1 error
