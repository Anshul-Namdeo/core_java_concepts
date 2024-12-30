import java.util.ArrayList;

class M 
{
    public static void main(String args[])
    {
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add(2.34);
        x.add(74);
        x.add(true);
        x.add('y');

        System.out.println(x);
    }
}


// D:\javaprac\37_collections>javac M.java
// Note: M.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\37_collections>java M
// [mohan, 2.34, 74, true, y]