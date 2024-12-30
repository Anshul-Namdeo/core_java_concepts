import java.util.ArrayList;
import java.util.Iterator;

class X4a 
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
            System.out.println(itr.next().length());
            System.out.println(itr.next().toString());
        }
    }
}


// D:\javaprac\37_collections>javac X4a.java
// X4a.java:20: error: cannot find symbol
//             System.out.println(itr.next().length());
//                                          ^
//   symbol:   method length()
//   location: class Object
// 1 error