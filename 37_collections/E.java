import java.util.ArrayList;

class E 
{
    public static void main(String args[])
    {
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add("sohan");
        x.add("rohan");
        x.add("gohan");
        x.add("tohan");

        System.out.println(x);

        boolean flag = x.remove("rohan");
         System.out.println(flag);

         System.out.println(x);
    }
}


// D:\javaprac\37_collections>javac E.java
// Note: E.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\37_collections>java E
// [mohan, sohan, rohan, gohan, tohan]
// true
// [mohan, sohan, gohan, tohan]