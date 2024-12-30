import java.util.ArrayList;

class K2 
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
        for(Object y : x)
        {
            System.out.println(y);
        }
    }
}


// D:\javaprac\42_generics>javac K2.java

// D:\javaprac\42_generics>java K2
// 56
// 78
// 12