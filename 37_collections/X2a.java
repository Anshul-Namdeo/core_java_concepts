import java.util.ArrayList;

class X2a 
{
    public static void main(String args[])
    {
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add("ganesh");
        x.add("vikram");
        x.add("raj");
        x.add("swaraj");

        // for(String y : x){
            for(Object y : x)
            {
                System.out.println(y);
            }
    }
}


// D:\javaprac\37_collections>javac X2a.java
// Note: X2a.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\37_collections>java X2a
// mohan
// ganesh
// vikram
// raj
// swaraj
