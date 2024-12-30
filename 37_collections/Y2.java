import java.util.ArrayList;

class Y2 
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

        int size = x.size();
        for(int i=0; i<size; i++)
        {
            System.out.println(x.remove(0));
        }

        System.out.println(x);
    }
}

// D:\javaprac\37_collections>java Y2
// [mohan, ganesh, vikram, raj, swaraj]
// mohan
// ganesh
// vikram
// raj
// swaraj
// []