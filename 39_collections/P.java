import java.util.PriorityQueue;

class P 
{
    public static void main(String[] args) {
        
        PriorityQueue pq = new PriorityQueue();

        pq.offer("jay");
        pq.offer("mohan");
        pq.offer("bablu");
        pq.offer("rohan");
        pq.offer("ganesh");
        pq.offer("virendravikram");

        System.out.println(pq);
    }
}
// D:\javaprac\39_collections>javac P.java
// Note: P.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\39_collections>java P
// [bablu, ganesh, jay, rohan, mohan, virendravikram]
