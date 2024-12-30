import java.util.ArrayList;

class F 
{
    public static void main(String args[])
    {
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add("sohan");
        x.add("rohan");
        x.add("mohan");
        x.add("gohan");
        x.add("tohan");
        x.add("mohan");

        System.out.println(x);
    }
}


// D:\javaprac\37_collections>javac F.java
// Note: F.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\37_collections>java F
// [mohan, sohan, rohan, mohan, gohan, tohan, mohan]
