import java.util.ArrayList;

class X3 
{
    public static void main(String args[])
    {
        ArrayList<String> x = new ArrayList<String> ();  // typeSafety

        x.add("mohan");
        x.add("ganesh");
        x.add("vikram");
        x.add("raj");
        x.add("swaraj");

        for(String y : x)
        {
            System.out.println(y);
            System.out.println(y.length());
        }
    }
}


// D:\javaprac\37_collections>javac X3.java

// D:\javaprac\37_collections>java X3
// mohan
// 5
// ganesh
// 6
// vikram
// 6
// raj
// 3
// swaraj
// 6
