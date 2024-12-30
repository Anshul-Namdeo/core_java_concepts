import java.util.Vector;

class I 
{
    public static void main(String args[])
    {
        Vector v = new Vector(10,2);

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

        v.add(100);

        System.out.println(v.capacity());
    }
}


// D:\javaprac\38_collections>javac I.java
// Note: I.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\38_collections>java I
// 10
// 12