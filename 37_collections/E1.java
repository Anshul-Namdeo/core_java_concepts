import java.util.ArrayList;

class E1 
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

        boolean flag = x.remove("eohan");
         System.out.println(flag);

         System.out.println(x);
    }
}

// D:\javaprac\37_collections>javac E1.java
// Note: E1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\37_collections>java E1
// [mohan, sohan, rohan, gohan, tohan]
// false
// [mohan, sohan, rohan, gohan, tohan]