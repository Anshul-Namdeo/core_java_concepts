import java.util.ArrayList;

class H 
{
    public static void main(String args[])
    {
        ArrayList x = new ArrayList();

        x.add(2.34);
        x.add(8.45);
        x.add(7.21);
        x.add(9.01);

        System.out.println(x);

        x.add(2,5.55);

        System.out.println(x);
    }
}

// D:\javaprac\37_collections>javac H.java
// Note: H.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\37_collections>java H
// [2.34, 8.45, 7.21, 9.01]
// [2.34, 8.45, 5.55, 7.21, 9.01]