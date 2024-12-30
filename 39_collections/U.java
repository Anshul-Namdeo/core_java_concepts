import java.util.PriorityQueue;

class U 
{
    public static void main(String args[])
    {
        PriorityQueue pq = new PriorityQueue();

        pq.offer(56);
        pq.offer("mohan");
        pq.offer(true);
        pq.offer(5.6);

        System.out.println(pq);
        System.out.println(pq.isEmpty());
        System.out.println(pq.size());
    }
}

// D:\javaprac\39_collections>java U
// Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
//         at java.base/java.lang.String.compareTo(String.java:140)
//         at java.base/java.util.PriorityQueue.siftUpComparable(PriorityQueue.java:647)
//         at java.base/java.util.PriorityQueue.siftUp(PriorityQueue.java:639)
//         at java.base/java.util.PriorityQueue.offer(PriorityQueue.java:330)
//         at U.main(U.java:10)