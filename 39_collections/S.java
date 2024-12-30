import java.util.PriorityQueue;

class S 
{
    public static void main(String args[])
    {
        PriorityQueue pq = new PriorityQueue();

        pq.offer(new Student("karthik",18));
        pq.offer(new Student ("simha",9));
        pq.offer(new Student ("vijendra",12));
        pq.offer(new Student ("prasad",5));
        pq.offer(new Student ("ganesh",10));
        pq.offer(new Student ("vijendra",12));

        System.out.println(pq);


    }
}

class Student implements Comparable <Student>
{
    String name ;
    Integer age ;

    Student(String name, Integer age)
    {
        this.name = name ;
        this.age = age ;
    }

    public String toString()
    {
        return name + " - " + age;
    }

    public int compareTo(Student obj)
    {
        String nm1 = this.name ;
        String nm2 = obj.name ;

        return nm1.compareTo(nm2);
    }
}


// D:\javaprac\39_collections>java S
// [ganesh - 10, karthik - 18, vijendra - 12, simha - 9, prasad - 5, vijendra - 12]
