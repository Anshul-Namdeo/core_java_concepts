import java.util.HashSet;
import java.util.Iterator;

class O1
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

        // Iterator itr = set.iterator();

        // for( ; itr.hasNext() ; )
        // {
        //     System.out.println(itr.next());
        // }

        for(int i=0; i<set.size(); i++)
        {
            System.out.println(set.get(i));
        }
    }
}


// D:\javaprac\38_collections>javac O1.java
// O1.java:26: error: cannot find symbol
//             System.out.println(set.get(i));
//                                   ^
//   symbol:   method get(int)
//   location: variable set of type HashSet
// Note: O1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error