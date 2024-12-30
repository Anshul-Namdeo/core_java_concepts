import java.util.ArrayList;
import java.util.Iterator;

class X4b 
{
    public static void main(String args[])
    {
        ArrayList<String> x = new ArrayList<String>();

        x.add("mohan");
        x.add("ganesh");
        x.add("vikram");
        x.add("raj");
        x.add("swaraj");

        Iterator itr = x.iterator();

        while(itr.hasNext())
        {
            String str = (String) itr.next();
            System.out.println(str.length());
        }
    }
}

// D:\javaprac\37_collections>javac X4b.java

// D:\javaprac\37_collections>java X4b
// 5
// 6
// 6
// 3
// 6