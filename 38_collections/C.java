import java.util.LinkedList;

class C 
{
    public static void main(String args[])
    {
         /****LinkedList as a Queue *****/
         LinkedList x = new LinkedList();

         x.offer(12);
         x.offer(45);
         x.offer(56);
         x.offer(78);
         x.offer(8);

         System.out.println(x);

         System.out.println(x.poll());
         System.out.println(x.poll());
         System.out.println(x.poll());
         System.out.println(x.poll());
         System.out.println(x.poll());

         System.out.println(x);
    }
}


// D:\javaprac\38_collections>javac C.java
// Note: C.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\38_collections>java C
// [12, 45, 56, 78, 8]
// 12
// 45
// 56
// 78
// 8
// []
