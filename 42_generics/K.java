import java.util.ArrayList ;

class K 
{
    public static void main(String args[])
    {
        ArrayList <Integer> list = new ArrayList <> ();

        list.add(56);
        list.add(12);
        list.add(78);

        pro(list);
    }

    static void pro (ArrayList x)
    {
        for(Integer y : x )
        {
            System.out.println(y);
        }
    }
}

// D:\javaprac\42_generics>javac K.java
// K.java:18: error: incompatible types: Object cannot be converted to Integer
//         for(Integer y : x )
//                         ^
// 1 error