import java.util.HashSet;

class Q 
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

        for(Object y : set)
        {
            System.out.println(y);
        }
    }
}


// D:\javaprac\38_collections>javac Q.java
// Note: Q.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\38_collections>java Q
// indra
// vishnu
// shiv
// ganesh
// murgan
// karthik