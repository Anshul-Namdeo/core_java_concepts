import java.util.HashSet;

class S1
{
    public static void main(String args[])
    {
        HashSet set = new HashSet();

        set.add(new Student("karthik",15));
        set.add(new Student("ratnesh",8));
        set.add(new Student("raj",19));
        set.add(new Student("vikki",22));
        set.add(new Student("lucky",20));
        set.add(new Student("raj",19));


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
}

// D:\javaprac\38_collections>java S1
// [vikki - 22, raj - 19, lucky - 20, karthik - 15, ratnesh - 8, raj - 19]
