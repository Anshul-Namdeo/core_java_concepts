import java.util.ArrayList;

class S 
{
    public static void main(String args[])
    {
        ArrayList<Integer> x = new ArrayList<Integer> ();

        x.add(12);
        x.add(13);
        x.add(14);
        x.add(21);
        x.add(9);
        System.out.println(x);
 
        // toArray() method  ArrayList ko Array mai convert kar deti hai ..
        // toArray() method ka retrun type array of Object hota hai..

        Object[] arr = x.toArray();
        
        for(Object obj : arr)
        {
            System.out.println(obj);
        }

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        // System.out.println(arr.get(0));
    }
}

// D:\javaprac\40_collections>java S
// [12, 13, 14, 21, 9]
// 12
// 13
// 14
// 21
// 9
// 12
// 13
// 14
// 21
// 9