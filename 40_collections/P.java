import java.util.TreeMap ;

class P 
{
    public static void main(String args[])
    {
        TreeMap map = new TreeMap();

        map.put(789,"mohan");
        map.put(234,"hitesh");
        map.put(621,"raghav");
        map.put(128,"naman");
        map.put(834,"sudhir");
        map.put(542,"jagtap");

        System.out.println(map);

    }
}


// D:\javaprac\40_collections>javac P.java
// Note: P.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\40_collections>java P
// {128=naman, 234=hitesh, 542=jagtap, 621=raghav, 789=mohan, 834=sudhir}