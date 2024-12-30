import java.util.ArrayList;

class G 
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

        boolean flag = x.remove("mohan");
        System.out.println(flag);

        System.out.println(x);

    }
}


// D:\javaprac\37_collections>javac G.java
// Note: G.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\37_collections>java G
// [mohan, sohan, rohan, mohan, gohan, tohan, mohan]
// true
// [sohan, rohan, mohan, gohan, tohan, mohan]