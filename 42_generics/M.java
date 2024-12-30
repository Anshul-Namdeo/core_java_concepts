import java.util.ArrayList;

class M 
{
    public static void main(String args[])
    {
        ArrayList list = new ArrayList ();

        list.add(true);
        list.add(3.4);
        list.add("umesh");

        pro(list);
    }

    static void pro(ArrayList <String> x)
    {
        x.add("ram");
        for(Object y : x)
        {
            System.out.println(y);
        }
    }
}


// D:\javaprac\42_generics>javac M.java
// Note: M.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\42_generics>java M
// true
// 3.4
// umesh
// ram