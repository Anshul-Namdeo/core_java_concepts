import java.util.ArrayList;

class L 
{
    public static void main(String args[])
    {
        ArrayList <Integer> list = new ArrayList <> ();

        list.add(56);
        list.add(78);
        list.add(12);

        pro(list);
    }

    static void pro(ArrayList x)
    {
        x.add("om");
        x.add(true);
        for(Object y : x)
        {
            System.out.println(y);
        }
    }
}

// D:\javaprac\42_generics>java L
// 56
// 78
// 12
// om
// true
