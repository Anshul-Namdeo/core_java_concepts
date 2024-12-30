import java.util.PriorityQueue;

class Q1 
{
    public static void main(String[] args) {
        
        PriorityQueue pq = new PriorityQueue();

        pq.offer(56);
        pq.offer(23);
        pq.offer(41);
        pq.offer(19);
        pq.offer(4);
        pq.offer(34);
        pq.offer(19);
      

        //  System.out.println(pq);

            int sz = pq.size();
            for(int i=0; i<sz; i++)
            {
                System.out.println(pq.poll());
            }
        
    }
}


// D:\javaprac\39_collections>javac Q1.java
// Note: Q1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\39_collections>java Q1
// 4
// 19
// 19
// 23
// 34
// 41
// 56