import java.util.HashSet;
import java.util.Iterator;

class O
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

        for( ; itr.hasNext() ; )
        {
            System.out.println(itr.next());
        }
    }
}


// D:\javaprac\38_collections>javac O.java
// Note: O.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\38_collections>java O
// indra
// vishnu
// shiv
// ganesh
// murgan
// karthik