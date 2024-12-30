import java.util.ArrayList;

class D 
{
    public static void main(String args[])
    {
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add("sohan");
        x.add("gohan");
        x.add("rohan");
        x.add("tohan");

        // boolean flag = x.contains("eohan");
        boolean flag = x.contains("rohan");

        System.out.println(flag);
    }
}

// D:\javaprac\37_collections>javac D.java
// Note: D.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\37_collections>java D
// false
