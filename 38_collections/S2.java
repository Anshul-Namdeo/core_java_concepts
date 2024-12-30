import java.util.HashSet;

class S2
{
    public static void main(String args[])
    {
        HashSet set = new HashSet();

        set.add(new Student("karthik",15));
        set.add(new Student("ratnesh",8));
        set.add(new Student("raj",19));
        set.add(new Student("vikki",22));
        set.add(new Student("lucky",20));
       

        System.out.println(set);

        Student a = new Student("raj",19);

        System.out.println(set.remove(a));

        System.out.println(set);
    }
}

class Student 
{
    String name;
    int age ;

    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String toString()
    {
        return name + " - " + age ;
    }

    public boolean equals(Object obj )
    {
        return this.name.equals(((Student)obj).name) && this.age == ((Student)obj).age;
    }
}