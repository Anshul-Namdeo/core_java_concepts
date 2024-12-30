import java.util.HashSet;

class Q1 
{
    public static void main(String args[])
    {
        HashSet<String> set = new HashSet<String>();

        set.add("karthik");
        set.add("ganesh");
        set.add("murgan");
        set.add("vishnu");
        set.add("shiv");
        set.add("indra");

        for(String y : set)
        {
            System.out.println(y);
        }
    }
}

// D:\javaprac\38_collections>javac Q1.java

// D:\javaprac\38_collections>java Q1
// indra
// vishnu
// shiv
// ganesh
// murgan
// karthik