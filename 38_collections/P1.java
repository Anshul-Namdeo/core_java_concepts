import java.util.HashSet;
import java.util.Iterator;

class P1 
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
            String str = (String)itr.next();
            System.out.println(str.length());
        }
    }
}


// D:\javaprac\38_collections>javac P1.java
// Note: P1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\38_collections>java P1
// 5
// 6
// 4
// 6
// 6
// 7