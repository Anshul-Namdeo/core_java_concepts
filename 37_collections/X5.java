import java.util.ArrayList;
import java.util.Iterator;

class X5 
{
    public static void main(String args[])
    {
        ArrayList<String> x = new ArrayList<String> ();

        x.add("mohan");
        x.add("ganesh");
        x.add("vikram");
        x.add("raj");
        x.add("swaraj");

        Iterator<String>itr = x.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next().length());
        }

    }
}


// D:\javaprac\37_collections>javac X5.java

// D:\javaprac\37_collections>java X5
// 5
// 6
// 6
// 3
// 6
