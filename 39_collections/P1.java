import java.util.PriorityQueue;

class P1 
{
    public static void main(String[] args) {
        
        PriorityQueue pq = new PriorityQueue();

        pq.offer("jay");
        pq.offer("mohan");
        pq.offer("bablu");
        pq.offer("rohan");
        pq.offer("ganesh");
        pq.offer("virendravikram");

        //  System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
// D:\javaprac\39_collections>javac P1.java
// Note: P1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\39_collections>java P1
// bablu
// ganesh
// jay
// mohan
// rohan
// virendravikram
