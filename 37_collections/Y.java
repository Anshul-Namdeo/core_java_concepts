import java.util.ArrayList;

class Y 
{
    public static void main(String args[])
    {
        ArrayList x = new ArrayList();

        
        x.add("mohan");
        x.add("ganesh");
        x.add("vikram");
        x.add("raj");
        x.add("swaraj");

        System.out.println(x);

        for(int i=0; i<x.size(); i++)
        {
            System.out.println(x.remove(i));
        }

        System.out.println(x +" ---------------------------- ");
    }
}


// D:\javaprac\37_collections>javac Y.java
// Note: Y.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\37_collections>java Y
// [mohan, ganesh, vikram, raj, swaraj]
// mohan
// vikram
// swaraj
// [ganesh, raj] ----------------------------
