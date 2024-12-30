import java.util.TreeSet;

class L 
{
    public static void main(String[] args) {
        
        TreeSet set = new TreeSet();

        
        set.add(new Student("kartik",18));
        set.add(new Student("simha",9));
        set.add(new Student("vijendra",12));
        set.add(new Student("prasad",5));
        set.add(new Student("ganesh",10));
        set.add(new Student("vijendra",12));

        System.out.println(set);
    }
}
class Student  implements Comparable 
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
        return name + " - " + age ;
    }

    public int compareTo(Object obj)
    {
        Student x = this;
        Student y = (Student)obj;

        String nm1 = x.name;
        String nm2 = y.name;

        return nm1.compareTo(nm2);
    }
}


// D:\javaprac\39_collections>javac L.java
// Note: L.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\39_collections>java L
// [ganesh - 10, kartik - 18, prasad - 5, simha - 9, vijendra - 12]