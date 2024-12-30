import java.util.PriorityQueue;

class Q 
{
    public static void main(String[] args) {
        
        PriorityQueue pq = new PriorityQueue();

        pq.offer(56);
        pq.offer(23);
        pq.offer(41);
        pq.offer(19);
        pq.offer(4);
      

        //  System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        
    }
}

// D:\javaprac\39_collections>java Q
// 4
// 19
// 23
// 41
// 56