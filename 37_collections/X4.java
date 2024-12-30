import java.util.ArrayList;
import java.util.Iterator;

class X4 
{
    public static void main(String args[])
    {
        ArrayList<String> x = new ArrayList<String>();   // typesafety

        x.add("mohan");
        x.add("ganesh");
        x.add("vikram");
        x.add("raj");
        x.add("swaraj");

        Iterator itr = x.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}


// D:\javaprac\37_collections>javac X4.java

// D:\javaprac\37_collections>java X4
// mohan
// ganesh
// vikram
// raj
// swaraj