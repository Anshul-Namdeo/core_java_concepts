import java.util.ArrayList;

class K1 
{
    public static void main(String args [])
    {
        ArrayList <Integer> list = new ArrayList <> ();

        list.add(56);
        list.add(78);
        list.add(12);

        pro(list);
    }

    static void pro(ArrayList <Integer> x)
    {
        for(Integer y : x)
        {
            System.out.println(y);
        }
    }
}


// D:\javaprac\42_generics>javac K1.java

// D:\javaprac\42_generics>java K1
// 56
// 78
// 12