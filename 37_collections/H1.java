import java.util.ArrayList;

class H1 
{
    public static void main(String args[])
    {
        ArrayList x = new ArrayList();

        x.add(2.34);
        x.add(8.45);
        x.add(7.21);
        x.add(9.01);

        System.out.println(x);

        // x.add(2,5.55);
        x.set(2,5.55);

        System.out.println(x);
    }
}

// D:\javaprac\37_collections>javac H1.java
// Note: H1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\37_collections>java H1
// [2.34, 8.45, 7.21, 9.01]
// [2.34, 8.45, 5.55, 9.01]
