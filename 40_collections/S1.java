import java.util.ArrayList;

class S1 
{
    public static void main(String args[])
    {
        ArrayList <Integer> x = new ArrayList<Integer> ();

        x.add(12);
        x.add(13);
        x.add(14);
        x.add(21);
        x.add(9);

        System.out.println(x);

        Object[] arr = x.toArray();

        for(Object obj : arr )
        {
            System.out.println(obj);
        }

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println((Integer)(arr[3].intValue()));
        System.out.println(arr[4]);
    }
}

// D:\javaprac\40_collections>javac S1.java
// S1.java:27: error: cannot find symbol
//         System.out.println(arr[3].intValue());
//                                  ^
//   symbol:   method intValue()
//   location: class Object
// 1 error
