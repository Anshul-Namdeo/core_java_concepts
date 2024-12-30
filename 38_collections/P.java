import java.util.HashSet;
import java.util.Iterator;

class P 
{
    public static void main(String args[])
    {
        HashSet set = new HashSet();

        set.add("karthik");
        set.add("ganesh");
        set.add("murgan");
        set.add("vishnu");
        set.add("shiv");
        set.add("indra");

        Iterator itr = set.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next().length());
            System.out.println(itr.next().toString());

        }
    }
}

// D:\javaprac\38_collections>javac P.java
// P.java:21: error: cannot find symbol
//             System.out.println(itr.next().length());
//                                          ^
//   symbol:   method length()
//   location: class Object
// Note: P.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error