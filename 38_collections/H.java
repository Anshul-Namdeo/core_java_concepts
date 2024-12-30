import java.util.Vector;

class H 
{
    public static void main(String args[])
    {
        Vector v = new Vector();

        v.add(1);
        v.add(11);
        v.add(21);
        v.add(31);
        v.add(41);
        v.add(51);
        v.add(61);
        v.add(71);
        v.add(81);
        v.add(91);
    
        System.out.println(v.capacity());

        v.add(200);

        System.out.println(v.capacity());
    }
}


// D:\javaprac\38_collections>javac H.java
// Note: H.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\38_collections>java H
// 10
// 20
