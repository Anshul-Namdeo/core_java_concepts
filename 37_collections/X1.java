import java.util.ArrayList;

class X1 
{
    public static void main(String args[])
    {
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add("ganesh");
        x.add("vikram");
        x.add("raj");
        x.add("swaraj");

        for(int i=0; i<x.size(); i++)
        {
            System.out.println(x.get(i));
        }
    }
}

// D:\javaprac\37_collections>java X1
// mohan
// ganesh
// vikram
// raj
// swaraj
