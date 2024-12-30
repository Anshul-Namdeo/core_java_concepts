import java.util.ArrayList;

class T 
{
    public static void main(String args[])
    {
        ArrayList <Integer> x = new ArrayList <> ();

        x.add(56);
        x.add(78);
        x.add(12);

        ArrayList <Double> y = new ArrayList <> ();

        y.add(5.6);
        y.add(3.6);
        y.add(11.6);

        ArrayList <Long> z = new ArrayList <> ();

        z.add(11L);
        z.add(4L);
        z.add(89L);

        pro(x);
        pro(y);
        pro(z);
    }

    static void pro(ArrayList <? extends Number> list)
    {
        for(Object next : list )
        {
            System.out.println(next);
        }
    }
}

// D:\javaprac\42_generics>java T
// 56
// 78
// 12
// 5.6
// 3.6
// 11.6
// 11
// 4
// 89
