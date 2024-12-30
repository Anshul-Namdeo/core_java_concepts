import java.util.ArrayList;

class X2b 
{
    public static void main(String args[])
    {
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add("ganesh");
        x.add("vikram");
        x.add("raj");
        x.add("swaraj");

        for(Object y : x)
        {
            System.out.println(y.length());
        }
    }
}


// D:\javaprac\37_collections>javac X2b.java
// X2b.java:17: error: cannot find symbol
//             System.out.println(y.length());
//                                 ^
//   symbol:   method length()